package Filehandling;

import java.io.*;
public class TaskFh6{
    public static void main(String args[])
    {
        try
        {
            byte b=0;
            FileInputStream infile = new FileInputStream("FileName01.txt");
            FileOutputStream outfile = new FileOutputStream("NewFile05.txt");

            // Initialize byteread here….
            int c;
            while((c = infile.read())!= -1)
            {
                b = (byte)infile.read();
                outfile.write(b);
            }
            System.out.println("Byte Copied From in.txt to out.txt FIle ");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Sorry..!! File Not Found...!!!");
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}