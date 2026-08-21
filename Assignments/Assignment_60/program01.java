/* Write a program to check whether a given string is pallindrome

Description : A string is called a pallindrome if it reads the same forwards and backward.

Input Format : One string string
Output Format : print : pallindrome string or not pallindrome string

Example : Input : madam
          Output : Palindrome string
*/

import java.io.*;

class pallindrome
{
    public boolean CheckPalindrome(String str)
    {
        int iStart = 0;
        int iEnd = 0;

        iEnd = str.length() - 1;

        while(iStart < iEnd)
        { 
            if(str.charAt(iStart) != str.charAt(iEnd))
            {
                return false;
            }
            iStart++;
            iEnd--;
        }
        return true;
    }
}

class program01
{
    public static void main(String[] args) throws Exception
    {
        String str = "";
        boolean bRet = false;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the String : ");

        str = bobj.readLine();

        pallindrome pobj = new pallindrome();

        bRet = pobj.CheckPalindrome(str);

        if(bRet == true)
        {
            System.out.println("It is Palindrome string");
        }
        else
        {
            System.out.println("It is Not pallindrome string");
        }
    }
}