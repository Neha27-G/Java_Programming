
import java.util.Scanner;

class NumberX
{
    public int ReverseNumber(int iNo)
    {
        int iDigit = 0;
        int iRev= 0;


        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }
        return iRev;
    }
}

class program77
{
    public static void main(String  A[]) 
    {
        int iValue = 0;
        int iRet = 0;
    
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number :");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        iRet = nobj.ReverseNumber(iValue);

        System.out.println("Reverse Number is :"+iRet);

    }   
}