// Input : 5
// Output : -5  -4  -3  -2  -1  0  1  2  3   4  5  

import java.util.Scanner;

class NumberX
{
    void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = -iNo; iCnt <= iNo ; iCnt++)
        {
            System.out.print(iCnt+"\t");
        }
        System.out.println("");
    }
}
class program51
{
    public static void main(String  A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number :");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        nobj.Display(iValue);

    }
}