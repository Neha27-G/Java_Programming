//Write a program to find the Sum of even and odd digits seperately in number.

class Logic
{
    void SumEvenOddDigits(int num)
    {
        int iCnt = 0;
        int iDigit = 0;
        int iEvenSum = 0;
        int iOddSum = 0;

        while(num != 0)
        {
            iDigit = num % 10;

            if(iDigit % 2 == 0)
            {
                iEvenSum =iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }
            num = num / 10;       
        }
        System.out.println("Sum of Even Digits is :"+iEvenSum);
        System.out.println("Sum of Odd Digits is :"+iOddSum);
    }
}
class program04
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.SumEvenOddDigits(123456);
        
    }
}