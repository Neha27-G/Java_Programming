class NumberX
{
    public void Display(int Arr[])
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}

class program92
{
    public static void main(String A[])
    {
        int Brr[] = {10, 20, 30, 40, 50};

        NumberX nobj = new NumberX();
        
        nobj.Display(Brr);
    }
}