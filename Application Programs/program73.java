
import java.util.Scanner;

class NumberX
{
    public void CountEvenOddDigits(int iNo)
    {
        int iDigit = 0;
        int iCountEven = 0;
        int iCountOdd = 0;


        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if((iDigit % 2) == 0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }
            iNo = iNo / 10;
        }
        System.out.println("Count of Even Numbers :"+iCountEven);
        System.out.println("Count of Odd Numbers :"+iCountOdd);
    }
}

class program73
{
    public static void main(String  A[]) 
    {
        int iValue = 0;
    
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number :");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        nobj.CountEvenOddDigits(iValue);

    }   
}