class program61
{
    public static void main(String  A[]) 
    {
        int iDigit = 0;
        int iNo = 751;

        iDigit = iNo %  10;
        System.out.println(iDigit+"\n");
        iNo = iNo / 10;

        iDigit = iNo %  10;
        System.out.println(iDigit+"\n");
        iNo = iNo / 10;

        iDigit = iNo %  10;
        System.out.println(iDigit+"\n");
        iNo = iNo / 10;
    }
}