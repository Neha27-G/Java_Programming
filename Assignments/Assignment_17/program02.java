//Write a program to check whether a number is palindrome or not.

class Logic
{
    void checkPalindrome(int num)
    {
        int iDigit = 0;
        int iRev = 0;
        int temp = num;

        while(num != 0)
        {
            iDigit =num % 10;
            iRev = (iRev * 10) + iDigit;
            num = num/ 10;
        }
        
        if(temp == iRev)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is Not Palindrome");
        }
    }
}
class program02
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
        
    }
}