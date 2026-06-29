
import java.util.Scanner;

class DemoX
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        //Filter
        if(iNo < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        for(iCnt = iNo; iCnt >= 0; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}

class program32
{
    public static void main(String A[])
    {
        
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Frequency:");
        iValue = sobj.nextInt();

        DemoX dobj = new DemoX();

        dobj.Display(iValue);
  
    }
}