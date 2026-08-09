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

class program95
{
    public static void main(String A[])
    {
        int Brr[] = {10, 20, 30, 40};          

        NumberX nobj = new NumberX();
        
        nobj.Display(Brr, 4);
    }
}