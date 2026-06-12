//Write a program to count how many even and odd numbers are present between 1 and N.

class Logic
{
    void CountEvenOddRange(int n)
    {
        int iCnt = 0;
        int iEven = 0;
        int iOdd = 0;

        for(iCnt = 1;iCnt <=n; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
        }
        System.out.println("Even numbers count is :"+iEven);
        System.out.println("Odd numbers count is :"+iOdd);
    }
        
}
class program02
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.CountEvenOddRange(50);
    }
}