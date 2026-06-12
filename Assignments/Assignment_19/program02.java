//Write a program to display the grade of the student based on marks.

class Logic
{
    void DisplayGrade(int marks)
    {
        if(marks < 0 || marks > 100)
        {
            System.out.println("Invalid Marks");
        }
        else if(marks >= 90)
        {
            System.out.println("Grade A");
        }
        else if(marks >= 80)
        {
            System.out.println("Grade B");
        }
        else if(marks >= 70)
        {
            System.out.println("Grade C");
        }
        else if(marks >= 50)
        {
            System.out.println("Grade D");
        }
        else if(marks >= 40)
        {
            System.out.println("Grade E");
        }
        else 
        {
            System.out.println("Fail");
        }

    }
}
class program02
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.DisplayGrade(82);
        
    }
}