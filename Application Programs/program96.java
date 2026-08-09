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

class program96
{
    public static void main(String A[])
    {
        int iLength = 4;

        int Brr[] = new int[iLength];

        Brr[0] = 10;
        Brr[1] = 20;  
        Brr[2] = 30;
        Brr[3] = 40;          
        
        NumberX nobj = new NumberX();
        
        nobj.Display(Brr, iLength);
    }
}