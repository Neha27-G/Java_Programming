
import java.util.Scanner;

class NumberX
{
    public void DisplayDigits(int iNo)
    {
        int iDigit = 0;

        for(; iNo != 0 ; iNo = iNo / 10)
        {
            iDigit = iNo %  10;
            System.out.println(iDigit+"\n");  
        }
    }
}

class program67
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