
import java.util.Scanner;

class TicketX
{
    public int CalculateTicketPrice(int iAge)
    {
        //Filter
        if(iAge < 0)
        {
            System.out.println("Invalid Input");
            return 0;
        }

        if(iAge >= 0  &&  iAge <=5)
        {
            return 0;
        }
        else if(iAge >= 6  &&  iAge <=18)
        {
            return 500;
        }
        else if(iAge >= 19  &&  iAge <=50)
        {
            return 900;
        }
        else
        {
            return 400;
        }
    }
}

class program17
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Please Enter the Age to Calculate Ticket Price: ");
        iValue = sobj.nextInt();

        TicketX tobj = new TicketX();  

        iRet = tobj.CalculateTicketPrice(iValue);

        System.out.println("Your Ticket price will be "+iRet+" rupees\n");

    }
}