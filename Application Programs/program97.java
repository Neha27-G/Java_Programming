import java.util.*;

class NumberX
{
    public void Display(int Arr[], int iSize)
    {
        int i = 0;
        
        for (i = 0; i < iSize; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}

class program97
{
    public static void main(String A[])
    {
        int iLength = 4;
        int i = 0;
        int Brr[] = new int[iLength]; 

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements :");
        
        for(i = 0; i < iLength; i++) 
        {
            Brr[i] = sobj.nextInt();    
        }

        NumberX nobj = new NumberX();
        
        nobj.Display(Brr, iLength);
    }
}