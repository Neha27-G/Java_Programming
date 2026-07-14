class program62
{
    public static void main(String  A[]) 
    {
        int iDigit = 0;
        int iNo = 751;

        while(iNo != 0)
        {
            iDigit = iNo %  10;
            System.out.println(iDigit+"\n ");
            iNo = iNo / 10;
        }
    }   
}