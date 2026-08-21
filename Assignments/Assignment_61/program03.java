/* Write a program to remove duplicate characters from a string.

Description : Remove repeated characters while keeping first occurance

Input Format : One sentence
Output Format : print : string without duplicate characters

Example : Input : banana
          Output : ban
*/

import java.util.*;

class StringX
{
    public String RemoveDuplicate(String str)
    {
        int i = 0;

        str = str.trim();
        str = str.replaceAll("\\s+", "");
        str = str.toLowerCase();

        char Arr[] = str.toCharArray();
    
        int Frequency[] = new int[26];

        StringBuffer sb = new StringBuffer();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                if(Frequency[Arr[i] - 'a'] == 0)
                {
                    sb.append(Arr[i]);
                    Frequency[Arr[i] - 'a'] = 1;
                }
            }
        }
        return  sb.toString();
    }
}

class program03
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = sobj.nextLine();

        StringX strobj = new StringX();

        String sRet = strobj.RemoveDuplicate(str);

        System.out.println("After removing duplicates : "+sRet);
       
    }
}