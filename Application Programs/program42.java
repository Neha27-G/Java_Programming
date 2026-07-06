
import java.util.Scanner;

class NumberX
{
    public void SumFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt<= (iNo/2); iCnt++)
        {
            if((iNo % iCnt)== 0)
            {
                iSum = iSum + iCnt;
            }         
        }
        System.out.println("Summation of Factors :"+iSum);
    }

}
class program42
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number :");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        nobj.SumFactors(iValue);
        
    }
}