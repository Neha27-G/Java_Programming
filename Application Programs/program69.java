
import java.util.Scanner;

class NumberX
{
    public int CountDigits(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

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
            iCount++;
            iNo = iNo / 10;
        }
        return iCount;
    }
}

class program69
{
    public static void main(String  A[]) 
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number :");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        iRet = nobj.CountDigits(iValue);

        System.out.println("Number of Digits are :"+iRet);

    }   
}