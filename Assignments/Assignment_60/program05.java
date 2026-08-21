/*  Write a program to count frequency of each character.

 Description : Display each character along with its count

Input Format : one string str
Output Format : character --> count

Example : Input : hello
          Output : h -> 1
                   e -> 1
                   l -> 2
                   o -> 1
*/

import java.util.*;

class Frequency
{
    public void CountFrequency(String str)
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

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                if(Frequency[Arr[i] - 'a'] != 0)
                {
                    System.out.println(Arr[i] + " -> " + Frequency[Arr[i] - 'a']);

                    Frequency[Arr[i] - 'a'] = 0;
                }
            }
        }
    }
}

class program05
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = sobj.nextLine();

        Frequency dobj = new Frequency();

        dobj.CountFrequency(str);

    }
}