
import java.util.Scanner;

//In Java there is No User Define Macro but we can used static final

class TicketX
{
    public static final int AGE_INVALID = -1;

    public int CalculateTicketPrice(int iAge)
    {
        //Filter
        if(iAge < 0)
        {
            return AGE_INVALID;
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

class program20
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

        if(iRet == TicketX.AGE_INVALID)
        {
            System.out.println("Please Enter Positive Age\n");
        }
        else
        {
            System.out.println("Your Ticket price will be "+iRet+" rupees\n");
        }
    }
}