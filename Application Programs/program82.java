class program82
{
    static int Arr[] = new int[7];     //static array(default value are 0)

    public static void main(String A[])
    {
        Arr[0] = 10;
        Arr[3] = 20;
        Arr[6] = 30;

        System.out.println(Arr.length);   // size of array 

        System.out.println(Arr[0]);
        System.out.println(Arr[3]);
        System.out.println(Arr[6]);

        System.out.println(Arr[2]);
        System.out.println(Arr[5]);

    }
}