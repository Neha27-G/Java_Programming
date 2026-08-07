/* Write java program to accept file name from user and check whether that file is regular file or not.

*/

import  java.io.*;
import  java.util.*;

class program02
{
    public static void main(String A[])
    {
        String FileName;
       
        Scanner sobj =  new Scanner(System.in);

        System.out.println("Enter file name :");
        FileName = sobj.nextLine();

       File fobj = new File(FileName);

       if(fobj.exists() == false)
       {
            System.out.println("File Does not exist");
            return;
       }

       if(fobj.isFile())
       {
            System.out.println(FileName +" is regular file");
       }
       else
       {
            System.out.println(FileName +" is not regular file");
       }
    }
}