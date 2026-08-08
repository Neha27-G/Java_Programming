//Write java program to accept directory name from user and display all names of files from that directory are regular file.

import  java.io.*;
import  java.util.*;

class Demo
{
    void displayFiles(String dir)
    {
        File fobj = new File(dir);

        if(fobj.exists() == false || fobj.isDirectory() == false)
        {
            System.out.println("Directory does not exists");
            return;
        }

        File Arr[] = fobj.listFiles();

        if(Arr == null)
        {
            System.out.println("Unable to access directory");
            return;
        }

        for(int i = 0; i < Arr.length; i++) 
        {
            if(Arr[i].isFile())
            {
                System.out.println(Arr[i].getName());
            }         
        }
    }
}

class program01
{
   public static void main(String A[])
   {
        String DirName;
        
        Scanner sobj =  new Scanner(System.in);
        Demo dobj = new Demo();

        System.out.println("Enter Directory Name :");
        DirName = sobj.nextLine();

        dobj.displayFiles(DirName);
   }

}