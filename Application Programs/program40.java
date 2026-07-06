
import java.util.Scanner;

class NumberX
{
    public void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt< iNo; iCnt++)
        {
            if((iNo % iCnt)== 0)
            {
                System.out.println(iCnt);
            }         
        }
    }

}
class program40
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number :");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        nobj.DisplayFactors(iValue);
        
    }
}