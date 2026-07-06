
import java.util.*;

class NumberX
{
    public boolean CheckPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt<= (iNo/2); iCnt++)
        {
            if((iNo % iCnt)== 0)
            {
                iSum = iSum + iCnt;
            } 

            if(iSum > iNo)
            {
                break;
            }        
        }

        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }     
    }

}
class program45
{
    public static void main(String A[]) 
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number :");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        bRet = nobj.CheckPerfect(iValue);
        
        if(bRet == true)
        {
            System.out.println("It is perfect Number");
        }
        else
        {
            System.out.println("It is Not perfect Number");
        }
        
    }
}