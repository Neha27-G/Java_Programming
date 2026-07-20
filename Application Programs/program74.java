
import java.util.Scanner;

class NumberX
{
    public int SumDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        if(iNo == 0)
        {
            return 1;
        }

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        return iSum;
    }
}

class program74
{
    public static void main(String  A[]) 
    {
        int iValue = 0;
        int iRet = 0;
    
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number :");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        iRet = nobj.SumDigits(iValue);

        System.out.println("Summation Of Digits are :"+iRet);

    }   
}