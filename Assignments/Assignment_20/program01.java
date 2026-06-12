//Write a program to find the sum of all even numbers up to N.

class Logic
{
    void SumEvenNumbers(int n)
    {
        int iSumEven = 0;
        int iCnt = 0;

        for(iCnt = 0; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSumEven = iSumEven + iCnt;
            }
        }
        System.out.println("Sum of Even number is:"+iSumEven);
    }
        
}
class program01
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.SumEvenNumbers(10);
        
    }
}