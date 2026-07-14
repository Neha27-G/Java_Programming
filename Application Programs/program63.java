
import java.util.Scanner;

class NumberX
{
    public void DisplayDigits(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo %  10;
            System.out.println(iDigit+"\n");
            iNo = iNo / 10;
        }
    }
}

class program63
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