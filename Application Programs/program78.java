
import java.util.Scanner;

class NumberX
{
    public boolean CheckPallindrome(int iNo)
    {
        int iDigit = 0;
        int iRev= 0;
        int temp = 0;

        temp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }

        if(temp == iRev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program78
{
    public static void main(String  A[]) 
    {
        int iValue = 0;
        boolean bRet = false;
    
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number :");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        bRet = nobj.CheckPallindrome(iValue);

        if(bRet == true)
        {
            System.out.println("Number is Pallindrome");
        }
        else
        {
            System.out.println("Number is Not Pallindrome");
        }

    }   
}