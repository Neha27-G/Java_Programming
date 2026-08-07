//Write java program to accept file from user and open that file.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class program01
{
    public static void main(String A[])  throws IOException
    {
        String FileName;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the FileName :");
        FileName = sobj.nextLine();

        try 
        {  
            FileReader fobj = new FileReader(FileName);
            System.out.println("File Opened Successfully..");
            fobj.close();
            
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File does not Exist");
        }
    }
}