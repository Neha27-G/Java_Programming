import java.util.*;

class program01
{
    public static void main(String A[]) 
    {
        int daysKept = 0;
        int ifine= 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the total number of days the book was kept :");
        daysKept = sobj.nextInt();

        if(daysKept < 0)
        {
            System.out.println("Invalid input");
        }
        else if(daysKept <= 7)
        {
            System.out.println("Returned on Time. No fine applicable");
        }
        else if(daysKept >= 8 && daysKept <= 12)
        {
            ifine = (daysKept - 7) * 5;
            System.out.println("Total fine to be paid : Rs. "+ifine);
        }
        else
        {
            ifine = (5 * 5) + (daysKept - 12) * 10;
            System.out.println("Total fine to be paid : Rs. "+ifine);
        }   
    }
}