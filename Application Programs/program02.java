
import java.util.*;

class program02
{
    public static void main(String A[])
    {
        int i , j , k;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter 1st Number :");
        i = sobj.nextInt();

        System.out.println("Enter 2nd Number :");
        j = sobj.nextInt();

        k = i + j;

        System.out.println("Addition is :"+k);
    }
}