//Write a program to check whether a number is divisible by 5 and 11 or not.

class Logic
{
    void CheckDivisible(int num)
    {
        if((num % 5 == 0) && (num % 11 == 0))
        {
            System.out.println("Number is divisible by 5 and 11.");
        }
        else
        {
            System.out.println("Number is Not divisible by 5 and 11.");
        }
        
    }
}
class program03
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.CheckDivisible(55);
        
    }
}