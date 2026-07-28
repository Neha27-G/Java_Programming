import java.util.Scanner;

class Program84
{
    public static void main(String A[])
    {
        int Arr[] = new int[5];
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements:");

        Arr[0] = sobj.nextInt();
        Arr[1] = sobj.nextInt();
        Arr[2] = sobj.nextInt();
        Arr[3] = sobj.nextInt();
        Arr[4] = sobj.nextInt();

        System.out.println("Elements of array are:");

        for(int iCnt = 0; iCnt < 5; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        sobj.close();
    }
}