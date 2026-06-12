//Write a program to check whether a number is prime or not.

class Logic
{
    void CheckPrime(int num)
    {
        int iCnt = 0;

        for(iCnt = 2; iCnt < num; iCnt++)
        {
            if(num % iCnt == 0)
            {
                break;
            }

        }
        if(iCnt == num)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is Not Prime");
        } 
    }
}
class program01
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.CheckPrime(11);
        
    }
}