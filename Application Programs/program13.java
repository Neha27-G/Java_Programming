
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
class program13
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

        if(bRet == true)
        {
            System.out.println(iValue+" is Even");
        }
        else
        {
            System.out.println(iValue+" is Odd");
        }
        
    }
}