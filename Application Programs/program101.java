import java.util.*;

class NumberX
{
    public int Display(int Arr[], int iSize)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum;
    }
}

class program101
{
    public static void main(String A[])
    {
        int Brr[] = null;
        int iLength = 0, i = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);  

        System.out.println("Enter number of Elements are :");
        iLength = sobj.nextInt();

        Brr = new int[iLength];

        System.out.println("Enter the elements :");

        for(i = 0; i < iLength; i++) 
        {
            Brr[i] = sobj.nextInt();
        }

        NumberX nobj = new NumberX();

        iRet = nobj.Display(Brr, iLength);
        System.out.println("Addition of all Elements are :"+iRet);

        Brr = null;

    }
}