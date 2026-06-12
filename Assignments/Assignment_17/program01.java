//Write a program to find sum of digits of numbers.

class Logic
{
    void sumDigits(int num)
    {
        int iSum = 0;
        int iDigit = 0;

        while(num != 0)
        {
            iDigit =num % 10;
            iSum = iSum + iDigit;
            num = num/ 10;
        }
        System.out.println("Sum of Digits is :"+iSum);
    }
}
class program02
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.sumDigits(1234);
        
    }
}