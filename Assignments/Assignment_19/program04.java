//Write a program to print each digit of number seperately.

class Logic
{
    void PrintDigits(int num)
    {
        int iDigit = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            System.out.println(iDigit);
            num = num / 10;
        }
    }
}
class program04
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.PrintDigits(9876);
        
    }
}