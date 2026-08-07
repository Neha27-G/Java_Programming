/* Write java program to accept directory name from user and create that directory.
*/

import  java.io.*;
import  java.util.*;

class program03
{
    public static void main(String A[])
    {
          String DirName;
          
          Scanner sobj =  new Scanner(System.in);

          System.out.println("Enter Directory Name :");
          DirName = sobj.nextLine();

          File fobj = new File(DirName);

          if(fobj.mkdir())
          {
          System.out.println("Directory created Successfully");
          }
          else
          {
          System.out.println("Directory Name already exist");
          }
    }
}