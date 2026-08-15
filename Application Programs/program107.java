import java.util.*;

class NumberX
{
    public boolean LinearSearch(int Arr[], int iSize)
    {
        int iCnt = 0;
        boolean bFlag = false;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] == 11)
            {
                bFlag = true; 
                break; 
            }
        }
        return bFlag;
    }
}

class program107
{
    public static void main(String A[])
    {
        int Brr[] = null;
        int iLength = 0, i = 0;
        boolean bRet = false;

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

        bRet = nobj.LinearSearch(Brr, iLength);

        if(bRet == true)
        {
            System.out.println("Element is present");
        }
        else
        {
            System.out.println("Element is not present");
        }
        
        Brr = null;

    }
}