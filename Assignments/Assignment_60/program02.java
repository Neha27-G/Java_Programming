/*  Write a program to check whether two strings are Anagrams.

 Description : Two strings are Anagram if they contains the same characters with the same frequency, regardless of order

Input Format : first string str1
               second string str2
Output Format : print : Anagram or not Anagram

Example : Input : listen
                  silent
          Output : Anagram
*/

import java.util.*;

class Anagram
{
    public boolean CheckAnagram(String str1, String str2)
    {
        int i = 0;

        str1 = str1.trim();
        str1 = str1.replaceAll("\\s+", "");
        str1 = str1.toLowerCase();

        str2 = str2.trim();
        str2 = str2.replaceAll("\\s+", "");
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length())
        {
            return false;
        }

        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        int Frequency[] = new int[26];

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Frequency[Arr[i] - 'a']++;
            }

            if(Brr[i] >= 'a' && Brr[i] <= 'z')
            {
                Frequency[Brr[i] - 'a']--;
            }
        }

        for(i = 0; i < Frequency.length; i++)
        {
            if(Frequency[i] != 0)
            {
                return false;
            }
        }

        return true;
    }
}

class program02
{
    public static void main(String[] args)
    {
         boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first String :");
        String str1 = sobj.nextLine();

        System.out.println("Enter the second String :");
        String str2 = sobj.nextLine();

        Anagram aobj = new Anagram();

        bRet = aobj.CheckAnagram(str1, str2);

        if(bRet == true)
        {
            System.out.println("Strings are Anagram");
        }
        else
        {
            System.out.println("Strings are not Anagram");
        }
        
    }
}