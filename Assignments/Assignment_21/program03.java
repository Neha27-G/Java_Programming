//Write a program to display all factors of given number.

class Logic
{
    void DisplayFactors(int n)
    {
        int iCnt = 0;

        for(iCnt = 1;iCnt <=n; iCnt++)
        {
            if( n % iCnt== 0)
            {
                System.out.println(iCnt);      
            }
        }
    }
        
}
class program03
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.DisplayFactors(12);
    }
}