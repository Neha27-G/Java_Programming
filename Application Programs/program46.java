// Input : 5
// Output : 1  3   5

import java.util.Scanner;

class NumberX
{
    void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt+=2)
        {
            System.out.print(iCnt+"\t");
        }
        System.out.println("");
    }
}
class program46
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