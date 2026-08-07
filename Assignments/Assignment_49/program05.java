//Write java program to accept directory name from user and display all names of files from that directory
import java.io.*;
import java.util.*;

class program05
{
    public static void main(String A[]) 
    {
        String DirName;
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the directory Name :");
        DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            String Arr[] = fobj.list();

            System.out.println("Files from the directory are :");

            for(i = 0; i < Arr.length; i++) 
            {
                System.out.println(Arr[i]); 
            }
        }
        else
        {
            System.out.println("Directory does not Exist");
        }
    }
}