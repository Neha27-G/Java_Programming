
import java.util.Scanner;

class DemoX
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }
}


class program25
{
    public static void main(String A[])
    {
        
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Frequency:");
        iValue = sobj.nextInt();

        DemoX dobj = new DemoX();

        dobj.Display(iValue);
  
    }
}