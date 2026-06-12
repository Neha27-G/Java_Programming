//Write a program to find the minimum of three numbers.

class Logic
{
    void FindMin(int a, int b, int c)
    {
        if((a < b) && (a < c))
        {
            System.out.println("Minimum Number is:"+a);
        }        
        else if((b < a) && ( b < c))
        {
            System.out.println("Minimum Number is :"+b);
        }
        else
        {
            System.out.println("Minimum Number is :"+c);
        }
    }
}
class program04
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.FindMin(3 ,7 ,2);
        
    }
}