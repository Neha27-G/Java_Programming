//Write a program to count total number of factors of given number.

class Logic
{
    void CountFactors(int n)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 1;iCnt <=n; iCnt++)
        {
            if( n % iCnt == 0)
            {
                iCount++;      
            }
        }
        System.out.println("Count of total number of factors is:"+iCount);
    }
        
}
class program04
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.CountFactors(20);
    }
}