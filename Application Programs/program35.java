import java.util.*;

class program35
{
    static void CheckDivisible(int iNo)                //private specifier
    {
        if((iNo % 3 == 0) && (iNo % 5 ==0))
        {
            System.out.println("Number is Divisible by 3 and 5");
        }
        else
        {
            System.out.println("Number is not Divisible by 3 and 5");
        }   
    }
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number :");
        iValue = sobj.nextInt();

        CheckDivisible(iValue);

    }
}