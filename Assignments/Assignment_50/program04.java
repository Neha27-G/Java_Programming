/* Write java program to accept file name from user and calculate checksum of that file and display on screen.
*/

import  java.io.*;
import  java.util.*;
import java.util.zip.CRC32;

class program04
{
   public static void main(String A[]) throws IOException
   {
      String FileName;
      int ch;
      
      Scanner sobj =  new Scanner(System.in);

      System.out.println("Enter File Name :");
      FileName = sobj.nextLine();

      try
      {
         FileInputStream fobj = new FileInputStream(FileName);

         CRC32 cobj = new CRC32();

         while((ch = fobj.read()) != -1) 
         {
            cobj.update(ch); 
         }

         System.out.println("CheckSum Value : "+ cobj.getValue());

         fobj.close();
      } 
      catch (FileNotFoundException e) 
      {
         System.out.println("File does not exist");
      }

   }
}