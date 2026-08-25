import java.util.*;

class TripFare
{
    public int CalculateFare(int Distance, String PeakHr)
    {
        int Fare = 0;

        if(Distance < 0)
        {
            return -1;
        }

        PeakHr = PeakHr.toLowerCase();

        if((PeakHr.equals("yes") || PeakHr.equals("no")) == false)
        {
            return 1;
        }

        if(Distance <= 10)
        {
            Fare = 50 + (Distance * 12);
        }
        else if(Distance > 10)
        {
            Fare = 50 + (10 * 12) + ((Distance-10) * 15);
        }

        if(PeakHr.equals("yes"))
        {
            Fare = Fare + (Fare * 20) / 100;
        }

        return Fare;
    }

}

class program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Distance in km (Integer): ");
        int distance = sobj.nextInt();

        System.out.println("Peak Hours (Yes/No) : ");
        String peakhr = sobj.next();

        TripFare tobj = new TripFare();

        int iRet = tobj.CalculateFare(distance,peakhr);

        if(iRet == -1)
        {
            System.out.println("Distance cannot be negative");
            return;
        }
        else if(iRet == 1)
        {
            System.out.println("Peak hours input should be Yes or No");
            return;
        }
        else
        {
            System.out.println("Distance : "+distance+" km");
            System.out.println("Peak Hour : "+ peakhr);
            System.out.println("Total Fare Rs.: "+iRet);
        }

    }
}