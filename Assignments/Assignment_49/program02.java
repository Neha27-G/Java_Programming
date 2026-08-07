//Write java program to accept file from user and open that file and display the contents on screen.

import java.io.FileNotFoundException;
import java.io.FileReader;
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
            FileReader fobj = new FileReader(FileName);

            while((ch = fobj.read()) != -1)
            {
                System.out.print((char)ch);
            }

            fobj.close();
            
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File does not Exist");
        }
    }
}