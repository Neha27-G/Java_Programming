/* Write a program to check whether a given number is Sunny Number or not.

Description : A number is Sunny if: num + 1 is perfect square

Input : One integer number
Output : print: Sunny number or not Sunny Number

Ex : Input : 8
     Explanation : 8 + 1 = 9, 9 is perfect square
     Output : Sunny Number
*/

import java.io.*;

class SunnyNumber
{
    public boolean CheckSunny(int iNo)
    {
        int iSquare = 0;
        int iRoot = 0;

        iSquare = iNo + 1;

        iRoot = (int)Math.sqrt(iSquare);


        if(iRoot * iRoot == iSquare)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program04
{
    public static void main(String[] args) throws Exception
    {
        int iValue = 0;
        boolean bRet = false;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number : ");

        iValue = Integer.parseInt(bobj.readLine());

        SunnyNumber sobj = new SunnyNumber();

        bRet = sobj.CheckSunny(iValue);

        if(bRet == true)
        {
            System.out.println("It is Sunny Number");
        }
        else
        {
            System.out.println("It is Not Sunny Number");
        }
    }
}