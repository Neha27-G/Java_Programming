/* Write a program to check whether a given number is a Strong Number or not.

Description : A number is called Strong number if the sum of factorial of each digit is equal to the number itself

Input : One integer number
Output : print: strong number or Not strong Number

Ex : Input : 145
     Explanation : 1! + 4! + 5! = 1 + 24 + 120 = 145
     Output : Strong Number
*/

import java.io.*;

class StrongNumber
{
    public boolean CheckStrong(int iNo)
    {
        int iFact[] = {1,1,2,6,24,120,720,5040,40320,362880};

        int iTemp = 0;
        int iDigit = 0;
        int iSum = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + iFact[iDigit];

            if(iSum > iTemp)
            {
                break;
            }

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

class program01
{
    public static void main(String[] args) throws Exception
    {
        int iValue = 0;
        boolean bRet = false;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number : ");

        iValue = Integer.parseInt(bobj.readLine());

        StrongNumber sobj = new StrongNumber();

        bRet = sobj.CheckStrong(iValue);

        if(bRet == true)
        {
            System.out.println("It is Strong Number");
        }
        else
        {
            System.out.println("It is not Strong Number");
        }
    }
}