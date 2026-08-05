class NumberX
{
    public void Display(int Arr[])
    {
        for (int i = 0; i < 8; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}

class program93
{
    public static void main(String A[])
    {
        int Brr[] = {10, 20, 30, 40, 50, 60,70,80};

        NumberX nobj = new NumberX();
        
        nobj.Display(Brr);
    }
}