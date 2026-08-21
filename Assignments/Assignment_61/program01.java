/* Write a program to reverse each word of sentence

Description : Reverse individual words but keep word order same

Input Format : One sentence
Output Format : print : sentence with reversed words

Example : Input : Java is powerful
          Output : avaJ si lufrewop
*/

import java.util.*;

class StringX
{
    public String WordReverse(String str)
    {
        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        StringBuffer sb = null;
        StringBuffer FinalStr = new StringBuffer("");

        for(int i = 0; i < Tokens.length; i++)
        {
            sb = new StringBuffer(Tokens[i]);
            sb = sb.reverse();
            FinalStr = FinalStr.append(sb);
            FinalStr = FinalStr.append(" ");
        }

        String output = new String(FinalStr);

        output = output.trim();

        return output;
    }
}

class program01
{
    public static void main(String  A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String :");

        String str = sobj.nextLine();

        StringX strobj = new StringX();

        String sRet = strobj.WordReverse(str);

        System.out.println(sRet);

    }
}