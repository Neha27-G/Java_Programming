/* Write a program to check whether a given number is Trimorphic Number or not.

Description : A number is Trimorphic if: its cube ends with the number itself

Input : One integer number
Output : print: Trimorphic number or not Trimorphic Number

Ex : Input : 4
     Explanation : 4^3 = 64 --> ends with 4
     Output : Trimorphic Number
*/

import java.io.*;

class Trimorphic
{
    public boolean CheckTrimorphic(int iNo)
    {
        int iCube = 0;
      
        iCube = iNo * iNo * iNo;

        while(iNo != 0)
        { 
            if(iNo % 10 != iCube % 10)
            {  
                break;
            }
            iNo = iNo / 10;
            iCube = iCube / 10;
        }

        if(iNo == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program06
{
    public static void main(String[] args) throws Exception
    {
        int iValue = 0;
        boolean bRet = false;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number : ");

        iValue = Integer.parseInt(bobj.readLine());

        Trimorphic sobj = new Trimorphic();

        bRet = sobj.CheckTrimorphic(iValue);

        if(bRet == true)
        {
            System.out.println("It is Trimorphic Number");
        }
        else
        {
            System.out.println("It is Not Trimorphic Number");
        }
    }
}