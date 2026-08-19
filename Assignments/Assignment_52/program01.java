import java.util.*;

class FineCalculator
{
    public int CalculateFine(int daysKept)
    {
        if(daysKept < 0)
        {
            return -1;
        }
        else if(daysKept <= 7)
        {
            return 0;
        }
        else if(daysKept >= 8 && daysKept <= 12)
        {
            return (daysKept - 7) * 5;
        }
        else
        {
            return (5 * 5) + (daysKept - 12) * 10;
        }   

    }
}

class program01
{
    public static void main(String A[]) 
    {
        int daysKept = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the total number of days the book was kept :");
        daysKept = sobj.nextInt();

        FineCalculator fobj = new FineCalculator();
        iRet = fobj.CalculateFine(daysKept);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else if(iRet == 0)
        {
            System.out.println("Returned on Time. No fine applicable");
        }
        else 
        {
            System.out.println("Total fine to be paid : Rs. "+iRet);
        } 
    }
}