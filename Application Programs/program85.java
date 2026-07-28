import java.util.Scanner;

class Program85
{
    public static void main(String A[])
    {
        int Arr[] = new int[5];
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements:");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        
       
        System.out.println("Elements of array are:");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        sobj.close();
    }
}