//Write a program to calculate the power of number using loops.

class Logic
{
    void CalculatePower(int base , int exp)
    {
        int iPower = 0;
        int iCnt = 1;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iPower = base * exp;
        }
        System.out.println("Power is :"+iPower);
    }
}
class program05
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.CalculatePower(2,5);
        
    }
}