//Write a program to print the multiplication table of a numbers.

class Logic
{
    void PrintTable(int num)
    {
        int iCnt = 1;

        for(iCnt = 1; iCnt <=10; iCnt++)
        {
            System.out.println(num * iCnt);
        }
        
    }
}
class program05
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.PrintTable(5);
        
    }
}