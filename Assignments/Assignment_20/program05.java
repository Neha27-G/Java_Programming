//Write a program to find the Smallest digit in the given number.

class Logic
{
    void FindSmallestDigit(int num)
    {
        int iDigit= 0;
        int iMinDigit = 9;

        if(num < 0)
        {
            num = -num;
        }

        while(num > 0)
        {
            iDigit = num % 10;

            if(iDigit < iMinDigit)
            {
                iMinDigit = iDigit;
            }
            num = num / 10;
        }
        System.out.println("Smallest Digit is :"+iMinDigit);

    }
        
}
class program05
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.FindSmallestDigit(45872);
        
    }
}