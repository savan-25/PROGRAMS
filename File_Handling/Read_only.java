// Java program to make file as read only

import java.util.Scanner;
import java.io.*;

public class Read_only {
    public static void main(String[] args) {
        try
        {   
            Scanner sobj = new Scanner(System.in);
            System.out.println("Enter the name of file that you want to crearte :");
            String str = sobj.nextLine();

            File fobj = new File(str);
            File f = new File(str);
            f.mkdir();
            //create new file
            fobj.createNewFile();

            fobj.setReadOnly();

            boolean bRet = false;

            if(bRet == fobj.canWrite())
            {
                System.out.println("File is not writable");
            }
            
        }catch(Exception eobj)
        {
            System.out.println(eobj);
        }
    }
}
