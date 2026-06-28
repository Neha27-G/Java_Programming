
import java.util.*;

class program03
{
    public static void main(String A[])
    {
        float i , j , k;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter 1st Number :");
        i = sobj.nextFloat();

        System.out.println("Enter 2nd Number :");
        j = sobj.nextFloat();

        k = i + j;

        System.out.println("Addition is :"+k);
    }
}