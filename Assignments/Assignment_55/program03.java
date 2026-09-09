/*

Base fare depends on distance slabs. Add charges for class (Sleeper/3AC/2AC). If booking within 24 hours, add Tatkal 30%. Senior citizen gets 40% discount.

Input: distance, classType, bookingHoursBefore, age

Output: finalFare + reason breakdown

*/

import java.util.*;/*

User enters usage: calls (min), data (GB), SMS (count). App suggests the cheapest plan among 4 plans.

Input: mins, gb, sms

Output: recommendedPlan, totalCost

Twist: If usage exceeds plan limits, add per-unit extra.

*/

class RechargeApp
{
    public float SuggestPlan(int CallMins, float data, int smsCount)
    {
        // Plan 1 limits
        int callLimit1 = 100;
        float datalimit1 = 1.0f;
        int smslimit1 = 100;

        // Plan 2 limits
        int callLimit2 = 100;
        float datalimit2 = 1.5f;
        int smslimit2 = 150;

        // Plan 3 limits
        int callLimit3 = 200;
        float datalimit3 = 2.0f;
        int smslimit3 = 200;

        // Plan 4 limits
        int callLimit4 = 300;
        float datalimit4 = 3.5f;
        int smslimit4 = 300;

        float Plan1 = 300 + Math.max(0, CallMins-callLimit1)*1 + Math.max(0, data-datalimit1)*150 + Math.max(0, smsCount - smslimit1)*1;

        float Plan2 = 350 + Math.max(0, CallMins-callLimit2)*1 + Math.max(0, data-datalimit2)*150 + Math.max(0, smsCount - smslimit2)*1;

        float Plan3 = 400 + Math.max(0, CallMins-callLimit3)*1 + Math.max(0, data-datalimit3)*150 + Math.max(0, smsCount - smslimit3)*1;

        float Plan4 = 500 + Math.max(0, CallMins-callLimit4)*1 + Math.max(0, data-datalimit4)*150 + Math.max(0, smsCount - smslimit4)*1;

        float minimum = Math.min(Math.min(Plan1, Plan2), Math.min(Plan3, Plan4));

        if(minimum == Plan1)
        {
            System.out.println("Recommended Plan : Plan 1");
        }
        else if(minimum == Plan2)
        {
            System.out.println("Recommended Plan : Plan 2");
        }
        else if(minimum == Plan3)
        {
            System.out.println("Recommended Plan : Plan 3");
        }
        else
        {
            System.out.println("Recommended Plan : Plan 4");
        }

        return minimum;
    }
}

class program03
{
    public static void main(String A[])
    {
        RechargeApp robj = new RechargeApp();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter total calls (mins) : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter data (GB) : ");
        float fValue = sobj.nextFloat();

        System.out.println("Enter SMS (count) : ");
        int iValue2 = sobj.nextInt();

        float fRet = robj.SuggestPlan(iValue1, fValue, iValue2);

        System.out.println("Cheapest recharge plan price is : "+ fRet + "Rs.");
    }
}

class TrainBooking
{
    public int FinalFair = 0;
    public int BaseFair = 0;

    public int Charge = 0;

    public int SleeperCharge = 200;
    public int AC3Charge = 150;
    public int AC2Charge = 200;

    public void CalcFair(int Distance, String ClassType, int Hours, int Age)
    {
        ClassType = ClassType.toLowerCase();

        if(Distance <= 0 || Hours < 0 || Age <= 0)
        {
            System.out.println("Invalid Input type");
            return;
        }

        if((ClassType.equals("sleeper") || ClassType.equals("3ac") || ClassType.equals("2ac")) == false)
        {
            System.out.println("Invalid Class type");
            return;
        }

        if(Distance < 100)
        {
            BaseFair = 200;
        }
        else if(Distance < 200)
        {
            BaseFair = 350;
        }
        else if(Distance < 500)
        {
            BaseFair = 500;
        }
        else
        {
            BaseFair = 1000;
        }

        if(ClassType.equals("sleeper"))
        {
            Charge = SleeperCharge;
            FinalFair = BaseFair + Charge;
        }
        else if(ClassType.equals("3ac"))
        {
            Charge = AC3Charge;
            FinalFair = BaseFair + Charge;
        }
        else
        {
            Charge = AC2Charge;
            FinalFair = BaseFair + Charge;
        }

        if(Hours <= 24)
        {
            int TatkalCharge = (FinalFair * 30) /100;
            FinalFair = FinalFair + TatkalCharge;
            System.out.println("Tatkal Charges Added : "+TatkalCharge);
        }

        if(Age >= 60)
        {
            int SeniorCitizenDiscount = (FinalFair * 40) /100;
            FinalFair = FinalFair - SeniorCitizenDiscount;
            System.out.println("Senior citizen discount : "+SeniorCitizenDiscount);
        }

        System.out.println("Base fair : "+BaseFair);
        System.out.println("Class "+ClassType+" charges : "+Charge);

        System.out.println("Final fair : "+FinalFair);
    }
}

class program02
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        TrainBooking hobj = new TrainBooking();

        System.out.println("Enter Distance : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter class type (Sleeper/3AC/2AC): ");
        String sValue1 = sobj.next();

        System.out.println("Enter Booking hours before train timing : ");
        int iValue2 = sobj.nextInt();

        System.out.println("Enter Age : ");
        int iValue4 = sobj.nextInt();

        hobj.CalcFair(iValue1, sValue1, iValue2, iValue4);
    }
}