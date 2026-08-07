//Write java program to accept file from user and open that file in write mode some data at the end of file.

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class program02
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
            FileWriter fobj = new FileWriter(FileName,true);

            fobj.append(" I love Programminggggg");

            System.err.println("File Appended Successfully");

            fobj.close();
            
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File does not Exist");
        }
    }
}