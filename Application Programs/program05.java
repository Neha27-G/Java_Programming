
import java.util.*;

//Using Static Method
class program05
{
    public static float  AddTwoNumbers(float fNo1 , float fNo2)
    {
        return  fNo1 + fNo2;
    }
    public static void main(String A[])
    {
        float fValue1 , fValue2 , fResult;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter 1st Number :");
        fValue1 = sobj.nextFloat();

        System.out.println("Enter 2nd Number :");
        fValue2 = sobj.nextFloat();

        fResult = AddTwoNumbers(fValue1, fValue2);

        System.out.println("Addition is :"+fResult);
    }
}