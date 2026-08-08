/*
    Write java program to accept directory name from user and write data of 
    all files along with its name into newly created file "Marvellous.txt"
*/

import  java.io.*;
import  java.util.*;

class Demo
{
    void WriteFileData(String dir, String Filename) throws IOException
    {
        File fobj = new File(dir);

        if(fobj.exists() == false || fobj.isDirectory() == false)
        {
            System.out.println("Directory does not exists");
            return;
        }

        FileWriter fw = new FileWriter(Filename);

        File Arr[] = fobj.listFiles();

        if(Arr == null)
        {
            System.out.println("Unable to access directory");
            return;
        }

        int data = 0;

        for(int i = 0; i < Arr.length; i++) 
        {
            if(Arr[i].isFile())
            {
                FileReader fr = new FileReader(Arr[i]);

                fw.write(Arr[i].getName()+ ": ");

                while((data = fr.read()) != -1)
                {
                    fw.write(data);
                }

                fw.write("\n");
                fr.close();
            } 

            fw.write("\n");    
        }
        fw.close();

        System.out.println("Files Contents successfully writtern inside Marvellous.txt with file names");
    }
}

class program04
{
   public static void main(String A[]) throws IOException
   {
        String DirName;
        
        Scanner sobj =  new Scanner(System.in);
        Demo dobj = new Demo();

        System.out.println("Enter Directory Name :");
        DirName = sobj.nextLine();

        dobj.WriteFileData(DirName,"Marvellous.txt");
   }

}