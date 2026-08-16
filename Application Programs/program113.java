import java.util.*;

class NumberX
{
    public int Minimum(int Arr[], int iSize)
    {
        int iCnt = 0;
        int iMin = 0;

        iMin = Arr[0];

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] < iMin)
            {
                iMin = Arr[iCnt];
            }
        }
        return iMin;
    }
}

class program113
{
    public static void main(String A[])
    {
        int Brr[] = null;
        int iLength = 0, i = 0, iValue = 0;
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
        
        iRet = nobj.Minimum(Brr, iLength);
        System.out.println("Minimum element is : "+iRet);
        
        Brr = null;
    }
}