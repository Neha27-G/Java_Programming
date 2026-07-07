// Input : 5
// Output : -5  -4  -3  -2  -1  0

import java.util.Scanner;

class NumberX
{
    void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = -iNo; iCnt <=0 ; iCnt++)
        {
            System.out.print(iCnt+"\t");
        }
        System.out.println("");
    }
}
class program49
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