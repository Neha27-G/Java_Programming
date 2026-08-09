import java.util.*;

class NumberX
{
    public int Summation(int Arr[], int iSize)
    {
        int i = 0;
        int iSum = 0;
        
        for (i = 0; i < iSize; i++)
        {
            iSum = iSum + Arr[i];
        }
        return iSum;
    }
}

class program98
{
    public static void main(String A[])
    {
        int iLength = 4;
        int i = 0;
        int iRet = 0;
        int Brr[] = new int[iLength]; 

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements :");
        
        for(i = 0; i < iLength; i++) 
        {
            Brr[i] = sobj.nextInt();    
        }

        NumberX nobj = new NumberX();
        
        iRet = nobj.Summation(Brr, iLength);
        System.out.println("Addition of all Elements are : "+iRet);
    }
}