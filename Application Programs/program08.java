
import java.util.*;

class program08
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRemainder = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        iValue = sobj.nextInt();

        iRemainder = iValue % 2;

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