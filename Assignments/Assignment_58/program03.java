/* Write a program to check whether a given number is a perfect Number or not.

Description : A number is called perfect number if the sum od all proper divisor (excluding the number) is equal to the number.

Input : One integer number
Output : print: perfect number or Not perfect Number

Ex : Input : 28
     Explanation : 1,2,4,7,14 -> sum = 28
     Output : perfect Number
*/

import java.io.*;

class PerfectNumber
{
    public boolean CheckPerfectNumber(int iNo)
    {
        int iSum = 0;
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNo)
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

        PerfectNumber pobj = new PerfectNumber();

        bRet = pobj.CheckPerfectNumber(iValue);

        if(bRet == true)
        {
            System.out.println("It is perfect Number");
        }
        else
        {
            System.out.println("It is not perfect Number");
        }
    }
}