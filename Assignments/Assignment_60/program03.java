/*  Write a program to check whether s string are pangram.

 Description : A string is pangram if it contains all alphabets from 'a' to 'z' at least once.

Input Format : one sentence str
Output Format : print : pangram or not pangram

Example : Input : the quick brown fox jumps over the lazy dog
          Output : pangram
*/

import java.util.*;

class Pangram
{
    public boolean CheckPangram(String str)
    {
        int i = 0;

        str = str.trim();
        str = str.replaceAll("\\s+", "");
        str = str.toLowerCase();

        char Arr[] = str.toCharArray();
    
        int Frequency[] = new int[26];

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Frequency[Arr[i] - 'a']++;
            }
        }

        for(i = 0; i < Frequency.length; i++)
        {
            if(Frequency[i] == 0)
            {
                return false;
            }
        }
        return true;
    }
}

class program03
{
    public static void main(String[] args)
    {
         boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = sobj.nextLine();

        Pangram Pobj = new Pangram();

        bRet = Pobj.CheckPangram(str);

        if(bRet == true)
        {
            System.out.println("String is Pangram");
        }
        else
        {
            System.out.println("String is not Pangram");
        }
        
    }
}