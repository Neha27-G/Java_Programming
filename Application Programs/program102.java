import java.util.*;

class NumberX
{
    public int CountEven(int Arr[], int iSize)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program102
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

        iRet = nobj.CountEven(Brr, iLength);
        System.out.println("Count of Even Element are :"+iRet);

        Brr = null;

    }
}