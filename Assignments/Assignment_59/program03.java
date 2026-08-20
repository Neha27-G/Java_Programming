/* Write a program to check whether a given number is Spy Number or not.

Description : A number is Spy if: (sum of digits) = (product of digits)

Input : One integer number
Output : print: spy number or not spy Number

Ex : Input : 1124
     Explanation : sum = 1 + 1 + 2 + 4 = 8
                   product = 1 * 1 * 2 * 4 = 8
     Output : spy Number
*/

import java.io.*;

class Spy
{
    public boolean CheckSpy(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;
        int iProd = 1;

        while(iNo != 0)
        { 
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iProd = iProd * iDigit;
            iNo = iNo / 10;
        }

        if(iSum == iProd)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program03
{
    public static void main(String[] args) throws Exception
    {
        int iValue = 0;
        boolean bRet = false;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number : ");

        iValue = Integer.parseInt(bobj.readLine());

        Spy sobj = new Spy();

        bRet = sobj.CheckSpy(iValue);

        if(bRet == true)
        {
            System.out.println("It is spy Number");
        }
        else
        {
            System.out.println("It is Not spy Number");
        }
    }
}