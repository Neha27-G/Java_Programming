/* Write a program to check whether one string is rotation of another.

Description : String B is rotation of string A it it can be obtained by shifting characters

Input Format : string1
               string2

Output Format : rotation or not rotation

Example : Input : abcd
                  cdab
          Output : rotation
*/

import java.util.*;

class StringX
{
    public boolean CheckRotation(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }

        String str = str1 + str1;

        if(str.contains(str2))
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
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First String :");
        String str1 = sobj.nextLine();

        System.out.println("Enter the Second String :");
        String str2 = sobj.nextLine();

        StringX strobj = new StringX();

        boolean bRet = strobj.CheckRotation(str1, str2);

        if(bRet == true)
        {
            System.out.println("Strings are Rotation");
        }
        else
        {
            System.out.println("Strings are Not Rotation");
        }
    }
}