/* Write a program to check whether a given number is Palindrome Number or not.

Description : A number is called Palindrome if remains the same when reversed

Input : One integer number
Output : print: Palindrome number or Not Palindrome Number

Ex : Input : 121
     Explanation : reverse : 121
     Output : Palindrome Number
*/

import java.io.*;

class Palindrome
{
    public boolean CheckPalindrome(int iNo)
    {
        int iDigit = 0;
        int iTemp = 0;
        int iRev = 0;

        iTemp = iNo;

        while(iNo != 0)
        {   
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }

        if(iRev == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program05
{
    public static void main(String[] args) throws Exception
    {
        int iValue = 0;
        boolean bRet = false;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number : ");

        iValue = Integer.parseInt(bobj.readLine());

        Palindrome pobj = new Palindrome();

        bRet = pobj.CheckPalindrome(iValue);

        if(bRet == true)
        {
            System.out.println("It is Palindrome Number");
        }
        else
        {
            System.out.println("It is not Palindrome Number");
        }
    }
}