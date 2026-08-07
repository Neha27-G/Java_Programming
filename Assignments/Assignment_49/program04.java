//Write java program to accept file from user and create new file of that name if it not existing.

import java.io.*;
import java.util.*;

class program04
{
    public static void main(String A[])  throws IOException
    {
        String FileName;
        int ch = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the FileName :");
        FileName = sobj.nextLine();

        try 
        {  
            File fobj = new File(FileName);

            if(fobj.createNewFile())
            {
                System.out.println("File created Successfully");
            }
            else
            {
                System.out.println("File already Exist");
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Unable to create file");
        }
    }
}