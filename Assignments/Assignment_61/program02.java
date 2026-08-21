/* Write a program to find longest word of sentence

Description : Identify the word having maximum length

Input Format : One sentence
Output Format : print : longest word

Example : Input : Java is powerful
          Output : powerful
*/

import java.util.*;

class StringX
{
    public String LongestWord(String str)
    {
        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String tokens[] = str.split(" ");

        System.out.println("Number of words :"+tokens.length);

        int iMax = 0;
        String temp = null;

        for(int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].length() >= iMax)
            {
                iMax = tokens[i].length();
                temp = tokens[i];
            }
        }

        System.out.println("All words with maximum length :");
        for(int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].length() == iMax)
            {
                System.out.println(tokens[i]);
            }
        }
        return temp;
    }
}

class program02
{
    public static void main(String  A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String :");

        String str = sobj.nextLine();

        StringX strobj = new StringX();

        String sRet = strobj.LongestWord(str);

        System.out.println("Longest Word : "+sRet);

    }
}