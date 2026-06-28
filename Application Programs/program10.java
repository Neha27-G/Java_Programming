
import java.util.*;

class Arithmetic
{
    public void CheckEvenOdd(int iNo)
    {
        int iRemainder = 0;

        iRemainder = iNo % 2;

        if(iRemainder == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        } 
    }
}
class program10
{
    
    public static void main(String A[])
    {
        int iValue = 0; 

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        iValue = sobj.nextInt();

        Arithmetic Aobj = new Arithmetic();

        Aobj.CheckEvenOdd(iValue);
    }
}