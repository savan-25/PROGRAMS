// reading form file using FileInputStream
// FileInputStream is meant for reading streams of raw bytes
// A FileInputStream obtains input byte from a file in a file system

// Constructor
// FileInputStream(File file) 
/*  creats a FileInputStream by opening a connction to an actual file using File object */

//FIleInputStream(String name)  // using File path
// FileInputStream(FileDescriptor fdobj)


import java.io.*;

public class File5
{
    public static void main(String args[])
    {
        try
        {
            // Attach File for FileInputStream
            FileInputStream fobj = new FileInputStream("./File5.java");

            // Read Data From FileInputStream 
            int ch;
            while((ch = fobj.read()) !=-1)
            {
                //print the data
                System.out.print((char) ch);
            }
            fobj.close();
        }catch(Exception eobj)
        {
            System.out.println(eobj);
        }
    }
}