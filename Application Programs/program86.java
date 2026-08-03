import java.util.Scanner;

class Program86
{
    static void CallByValue(int iNo)
    {
        iNo++;
    }

    public static void main(String A[])
    {
        int iValue = 11;

        CallByValue(iValue);

        System.out.println("Value After Function call :"+iValue);
    }
}