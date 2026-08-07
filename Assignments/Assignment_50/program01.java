/* Write java program to accept two file names from user and 
   open first file and create new file (second) 
   and copy the data frpm first file into newly create file.

*/

import  java.io.*;
import  java.util.*;

class program01
{
    public static void main(String A[]) throws  IOException
    {
        String Source;
        String Destination;
        int ch = 0;

        Scanner sobj =  new Scanner(System.in);

        System.out.println("Enter First file name :");
        Source = sobj.nextLine();

        System.out.println("Enter Second file name :");
        Destination = sobj.nextLine();

        try 
        {
            FileReader frobj = new FileReader(Source);
            FileWriter fwobj = new FileWriter(Destination);

            while((ch = frobj.read()) != -1)
            {
                fwobj.write(ch);
            }
            frobj.close();
            fwobj.close();

            System.out.println("Data Copied Successfully");
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Source file does not Exist");
        }
    }
}