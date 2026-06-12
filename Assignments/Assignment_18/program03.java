//Write a program to print all Odd numbers up to N.

class Logic
{
    void PrintOddNumbers(int num)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt <= num; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.print(iCnt+ " ");
            }
        }
    }
}
class program03
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.PrintOddNumbers(20);
        
    }
}