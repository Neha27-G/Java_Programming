/* Write a program to check whether a given number is a Armstrong Number or not.

Description : A number is called Armstrong number if : (the sum of each digit raised to power of total digits) = number

Input : One integer number
Output : print: Armstrong number or Not Armstrong Number

Ex : Input : 153
     Explanation : 1^3 + 5^3 + 3^3 = 153
     Output : Armstrong Number
*/

import java.io.*;

class Armstrong
{
    public boolean CheckArmStrong(int iNo)
    {
        int iTemp = 0;
        int iDigit = 0;
        int iSum = 0;
        int iCount = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;

        }
        iNo = iTemp;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + (int)Math.pow(iDigit, iCount);
            iNo = iNo / 10;
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

class program02
{
    public static void main(String[] args) throws Exception
    {
        int iValue = 0;
        boolean bRet = false;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number : ");

        iValue = Integer.parseInt(bobj.readLine());

        Armstrong aobj = new Armstrong();

        bRet = aobj.CheckArmStrong(iValue);

        if(bRet == true)
        {
            System.out.println("It is Armstrong Number");
        }
        else
        {
            System.out.println("It is not Armstrong Number");
        }
    }
}