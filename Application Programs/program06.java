
import java.util.*;

class Arithmetic
{
    public float  AddTwoNumbers(float fNo1 , float fNo2)
    {
        float fAns = 0.0f;

        fAns = fNo1 + fNo2;

        return fAns;
    }
}
class program06
{
    public static void main(String A[])
    {
        float fValue1 , fValue2 , fResult;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter 1st Number :");
        fValue1 = sobj.nextFloat();

        System.out.println("Enter 2nd Number :");
        fValue2 = sobj.nextFloat();

        Arithmetic Aobj = new Arithmetic();

        fResult = Aobj.AddTwoNumbers(fValue1, fValue2);

        System.out.println("Addition is :"+fResult);
    }
}