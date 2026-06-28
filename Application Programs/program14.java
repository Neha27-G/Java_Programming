
import java.util.*;

class Arithmetic
{
    public boolean  CheckEvenOdd(int iNo)
    {
        if((iNo % 2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class program14
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false; 

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        bRet = aobj.CheckEvenOdd(iValue);

        if(bRet) //bRet itself already stores a boolean value(true or false)
        {
            System.out.println(iValue+" is Even");
        }
        else
        {
            System.out.println(iValue+" is Odd");
        }
        
    }
}