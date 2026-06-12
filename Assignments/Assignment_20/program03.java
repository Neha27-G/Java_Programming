//Write a program to check whether a number is perfect number or not.

class Logic
{
    void CheckPerfect(int num)
    {
        int iCnt = 0;
        int iPerf = 0;

        for(iCnt = 1; iCnt <= num/2; iCnt++)
        {
            if(num % iCnt == 0)
            {
                iPerf = iPerf + iCnt;
            }
        }

        if(iPerf == num)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not Perfect Number");
        }
    }
        
}
class program03
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.CheckPerfect(6);
        
    }
}