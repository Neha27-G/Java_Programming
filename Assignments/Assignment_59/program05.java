/* Write a program to check whether a given number is Disarium Number or not.

Description : A number is Disarium if: sum of digits raised to their position(starting from 1)equals the number.

Input : One integer number
Output : print: Disarium number or not Disarium Number

Ex : Input : 135
     Explanation : 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135
     Output : Disarium Number
*/

import java.io.*;

class Disarium
{
    public boolean CheckDisarium(int iNo)
    {
        int iTemp = 0;
        int iDigit = 0;
        int iSum = 0;
        int iCount = 0;

        iTemp = iNo;
        
        while(iTemp != 0)
        {
            iCount++;
            iTemp = iTemp / 10;
        }

        iTemp = iNo;

        while(iTemp != 0)
        {
            iDigit = iTemp % 10;
            iSum = iSum + (int)Math.pow(iDigit, iCount);

            iCount--;
            iTemp = iTemp / 10;
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

class program05
{
    public static void main(String[] args) throws Exception
    {
        int iValue = 0;
        boolean bRet = false;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number : ");

        iValue = Integer.parseInt(bobj.readLine());

        Disarium sobj = new Disarium();

        bRet = sobj.CheckDisarium(iValue);

        if(bRet == true)
        {
            System.out.println("It is Disarium Number");
        }
        else
        {
            System.out.println("It is Not Disarium Number");
        }
    }
}