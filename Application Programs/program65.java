
import java.util.Scanner;

class NumberX
{
    public void DisplayDigits(int iNo)
    {
        while(iNo > 0)
        {
            System.out.println((iNo %  10)+"\n");
            iNo = iNo / 10;
        }
    }
}

class program65
{
    public static void main(String  A[]) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number :");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        nobj.DisplayDigits(iValue);

    }   
}