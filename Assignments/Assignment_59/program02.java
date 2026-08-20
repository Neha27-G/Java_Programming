/* Write a program to check whether a given number is Automorphic Number or not.

Description : A number is Automorphic if its square ends with the same digits as the number.

Input : One integer number
Output : print: Automorphic number or Automorphic Number

Ex : Input : 25
     Explanation : 25^2 = 625 --> ends with 25
     Output : Automorphic Number
*/

import java.io.*;

class Automorphic
{
    public boolean CheckAutomorphic(int iNo)
    {
        int iSquare = 0;
      
        iSquare = iNo * iNo;

        while(iNo != 0)
        { 
            if(iNo % 10 != iSquare % 10)
            {  
                break;
            }
            iNo = iNo / 10;
            iSquare = iSquare / 10;
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

class program02
{
    public static void main(String[] args) throws Exception
    {
        int iValue = 0;
        boolean bRet = false;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number : ");

        iValue = Integer.parseInt(bobj.readLine());

        Automorphic nobj = new Automorphic();

        bRet = nobj.CheckAutomorphic(iValue);

        if(bRet == true)
        {
            System.out.println("It is Automorphic Number");
        }
        else
        {
            System.out.println("It is not Automorphic Number");
        }
    }
}