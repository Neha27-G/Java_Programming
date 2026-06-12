//Write a program to check Whether the number is positive , negative, 0r zero.

class Logic
{
    void CheckSign(int num)
    {
       if(num > 0)
       {
            System.out.println("Number is positive");
       }
       else if(num < 0)
       {
            System.out.println("Number is Negative");
       }
       else
       {
            System.out.println("Number is Zero");
       }
    }
}
class program05
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.CheckSign(-8);
        
    }
}