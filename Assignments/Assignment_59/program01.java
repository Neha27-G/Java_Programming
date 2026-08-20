/* Write a program to check whether a given number is Neon Number or not.

Description : A number is Neon if the sum of digits of its square equals the number

Input : One integer number
Output : print: Neon number or Not Neon Number

Ex : Input : 9
     Explanation : 9^2 = 81, sum digits = 8 + 1 = 9
     Output : Neon Number
*/

import java.io.*;

class Neon
{
    public boolean CheckNeon(int iNo)
    {
        int iSquare = 0;
        int iDigit = 0;
        int iSum = 0;
        int iTemp = 0;

        iTemp = iNo;

        iSquare = iNo * iNo;

        while(iSquare != 0)
        {   
            iDigit = iSquare % 10;
            iSum = iSum + iDigit;
            iSquare = iSquare / 10;
        }

        if(iSum == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program01
{
    public static void main(String[] args) throws Exception
    {
        int iValue = 0;
        boolean bRet = false;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number : ");

        iValue = Integer.parseInt(bobj.readLine());

        Neon nobj = new Neon();

        bRet = nobj.CheckNeon(iValue);

        if(bRet == true)
        {
            System.out.println("It is Neon Number");
        }
        else
        {
            System.out.println("It is not Neon Number");
        }
    }
}