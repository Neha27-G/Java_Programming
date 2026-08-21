/* Write a program to count vowels and consonants in a string

Description : count total vowels (a e i o u) and consonants seperately.

Input Format : One string
Output Format : print : vowels : <count>
                        consonants : <count>

Example : Input : Education
          Output : vowels : 5
                   consonants : 4
*/

import java.util.*;

class StringX
{
    public String CountVowelsConsonants(String str)
    {
        int iVowel = 0;
        int iConsonant = 0;

        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                if(Arr[i] == 'a' || Arr[i] == 'e' || 
                   Arr[i] == 'i' || Arr[i] == 'o' || 
                   Arr[i] == 'u')
                {
                    iVowel++;
                }
                else
                {
                    iConsonant++;
                }
            }
        }

        return "Vowels : " + iVowel + "\nConsonants : " + iConsonant;
    }
}

class program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String :");

        String str = sobj.nextLine();

        StringX strobj = new StringX();

        String sRet = strobj.CountVowelsConsonants(str);

        System.out.println(sRet);
    }
}

