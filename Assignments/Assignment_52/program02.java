import java.util.*;

class ATM
{
    private int balance;
    private int WithdrawAmount;

    public ATM(int A, int B)
    {
        this.balance = A;
        this.WithdrawAmount = B;
    }

    public int Withdraw()
    {
        if(balance < 0 || WithdrawAmount <= 0)
        {
            return -1;
        }

        if(WithdrawAmount % 100 != 0)
        {
            return -2;
        }

        if(WithdrawAmount > 25000)
        {
            return -3;
        }

        if(balance - WithdrawAmount < 1000)
        {
            return -4;
        }
        
        return balance - WithdrawAmount;
    }
}

class program02
{
    public static void main(String A[]) 
    {
        int balance = 0;
        int WithdrawAmount = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Current balance : ");
        balance = sobj.nextInt();

        System.out.println("Enter Withdrawal Amount : ");
        WithdrawAmount = sobj.nextInt();

        ATM aboj = new ATM(balance, WithdrawAmount);
        iRet = aboj.Withdraw();

        if(iRet == -1)
        {
            System.out.println("Transaction Failed: Invalid input");
        }
        else if(iRet == -2)
        {
            System.out.println("Transaction Failed: Withdrawal amount must be a multiple of Rs.100");
        }
        else if(iRet == -3)
        {
            System.out.println("Transaction Failed: Maximum withdrawal limit is Rs.25000");
        }
        else if(iRet == -4)
        {
            System.out.println("Transaction Failed: Minimum balance of Rs.1000 must be maintained");
        }
        else
        {
            System.out.println("Transaction Successful.");
            System.out.println("Remaining Balance: Rs." + iRet);
        }
    }
}