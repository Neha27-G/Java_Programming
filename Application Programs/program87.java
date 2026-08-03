import java.util.Scanner;

class Program87
{
    static void CallByAddress(int ptr[])
    {
        ptr[0]++;
    }

    public static void main(String A[])
    {
        int iValue[] = {11};

        CallByAddress(iValue);

        System.out.println("Value After Function call :"+iValue[0]);
    }
}