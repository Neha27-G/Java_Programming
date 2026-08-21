/*  Write a program to print duplicate characters from a string.

 Description : Find and display characters that appear more than more

Input Format : one string str
Output Format : print : duplicate characters printed in one line.

Example : Input : programming
          Output : r  g  m
*/

import java.util.*;

class Duplicate
{
    public void CheckDuplicate(String str)
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
            if(Frequency[i] > 1)
            {
                System.out.println((char)(i + 'a') + "");
            }
        }
        System.out.println();
    }
}

class program04
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = sobj.nextLine();

        Duplicate dobj = new Duplicate();

        dobj.CheckDuplicate(str);

    }
}