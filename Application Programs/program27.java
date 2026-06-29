
import java.util.Scanner;

class DemoX
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        //Updator
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.println("Jay Ganesh...");
        }
    }
}


class program27
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