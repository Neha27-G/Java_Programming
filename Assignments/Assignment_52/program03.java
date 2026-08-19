import java.util.*;

class StudentResult
{
    private int Marks[];

    public StudentResult(int Marks[])
    {
        this.Marks = Marks;
    }

    public double CalculateResult()
    {
        int total = 0;

        for(int iCnt = 0; iCnt < Marks.length; iCnt++)
        {
            if(Marks[iCnt] < 0 || Marks[iCnt] > 100)
            {
                return -1;
            }

            if(Marks[iCnt] < 35)
            {
                return 0;
            }

            total = total + Marks[iCnt];
        }

        return (double)total / Marks.length;
    }
}

class program03
{
    public static void main(String A[]) 
    {
        double dRet = 0;
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        int Marks[] = new int[5];

        for (iCnt = 0; iCnt < 5; iCnt++) 
        {
            System.out.println("Enter the Marks of Subjects "+(iCnt + 1)+ " : ");
            Marks[iCnt] = sobj.nextInt();
        }

        StudentResult ssobj = new StudentResult(Marks);
        dRet = ssobj.CalculateResult();

        if(dRet == -1)
        {
            System.out.println("Invalid Input");
        }
        else if(dRet == 0)
        {
            System.out.println("Result : Fail");
        }
        else
        {
            System.out.println("Average Marks : "+dRet);

            if(dRet >= 75)
            {
                System.out.println("Final Result : Distinction");
            }
            else if(dRet >= 60)
            {
                System.out.println("Final Result : First Class");
            }
            else if(dRet >= 50)
            {
                System.out.println("Final Result : Second Class");
            }
            else
            {
                System.out.println("Final Result : Pass");
            }
        }
    }
}