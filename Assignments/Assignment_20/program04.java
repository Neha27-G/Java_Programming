//Write a program to find the largest digit in the given number.

class Logic
{
    void FindLargestDigit(int num)
    {
        int iDigit= 0;
        int iMaxDigit = 0;

        if(num < 0)
        {
            num = -num;
        }

        while(num > 0)
        {
            iDigit =num % 10;

            if(iDigit > iMaxDigit)
            {
                iMaxDigit = iDigit;
            }
            num = num / 10;
        }
        System.out.println("Largest Digit is :"+iMaxDigit);

    }
        
}
class program04
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.FindLargestDigit(83429);
        
    }
}