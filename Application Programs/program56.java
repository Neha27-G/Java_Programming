
import java.util.Scanner;

class NumberX
{
    public boolean CheckPrime(int iNo)
    {
        int iCnt = 0;
        boolean bFlag = false;

        //filter
        if(iNo <= 1)
        {
            return false;
        }

        for(bFlag = true,iCnt = 2; iCnt <= iNo/2; iCnt++)
        {
            if((iNo % iCnt)==0)
            {
                bFlag = false;
                break;
            }
        }
        return bFlag;

    }
}
class program56
{
    public static void main(String  A[])
    {
        int iValue;
        boolean bRet = false; 

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number:");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        bRet = nobj.CheckPrime(iValue);

        if(bRet == true)
        {
            System.out.println("It is a prime Number");
        }
        else
        {
            System.out.println("It is Not a prime Number");
        }

    }
}