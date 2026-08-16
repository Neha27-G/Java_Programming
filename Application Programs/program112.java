import java.util.*;

class NumberX
{
    public int Maximum(int Arr[], int iSize)
    {
        int iCnt = 0;
        int iMax = 0;

        iMax = Arr[0];

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax = Arr[iCnt];
            }
        }
        return iMax;
    }
}

class program112
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
        
        iRet = nobj.Maximum(Brr, iLength);
        System.out.println("Maximum element is : "+iRet);
        
        Brr = null;
    }
}