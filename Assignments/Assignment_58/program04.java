/* Write a program to check whether a given number is a Harshad Number or not.

Description : A number is called Harshad number if it is divisible by the sum of its digits.

Input : One integer number
Output : print: Harshad number or Not Harshad Number

Ex : Input : 18
     Explanation : sum digits = 1 + 8 = 9, 18 % 9 = 0
     Output : Harshad Number
*/

import java.io.*;

class HarshadNumber
{
    public boolean CheckHarshadNumber(int iNo)
    {
        int iSum = 0;
        int iDigit = 0;
        int iTemp = 0;

        iTemp = iNo;

        while(iNo != 0)
        {   
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        if(iTemp % iSum == 0)
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

        HarshadNumber hobj = new HarshadNumber();

        bRet = hobj.CheckHarshadNumber(iValue);

        if(bRet == true)
        {
            System.out.println("It is Harshad Number");
        }
        else
        {
            System.out.println("It is not Harshad Number");
        }
    }
}