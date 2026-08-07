//Write java program to accept directory name from user and display all names of files from that directory and size of each file on screen.

import  java.io.*;
import  java.util.*;

class program05
{
   public static void main(String A[])
   {
      String DirName;
      
      Scanner sobj =  new Scanner(System.in);

      System.out.println("Enter Directory Name :");
      DirName = sobj.nextLine();

      File fobj = new File(DirName);

      if(fobj.exists() && fobj.isDirectory())
      {
         File Arr[] = fobj.listFiles();

         System.out.println("Files and their sizes are :");

         for(int i = 0; i < Arr.length; i++) 
         {
            if(Arr[i].isFile())
            {
               System.out.println(Arr[i].getName() + " : " + Arr[i].length() + " bytes");
            }
             
         }
      }
      else
      {
         System.out.println("Directory does not exist");
      }
   }

}