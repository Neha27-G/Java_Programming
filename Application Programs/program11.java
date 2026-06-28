
import java.util.*;

class Arithmetic
{
    public static int CheckEvenOdd(int iNo)
    {
        int iRemainder = 0;

        iRemainder = iNo % 2;

        return iRemainder;
    }
}
class program11
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0; 

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        iValue = sobj.nextInt();

        iRet = Arithmetic.CheckEvenOdd(iValue);

        if(iRet == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
        
    }
}