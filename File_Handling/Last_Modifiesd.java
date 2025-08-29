// get last modified time of file

import java.util.Date;
import java.util.Scanner;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Last_Modifiesd {
    public static void main(String args[])
    {
        try
        {   
            Scanner sobj = new Scanner(System.in);
            System.out.println("Enter the File Name that you check last Modifcation");
            String file_name = sobj.nextLine();
        
            File fobj = new File(file_name);

            long time1 = fobj.lastModified();
            // Convert milliseconds into readable date time
        // format any desirable format can be achieved using
        // SimpleDateForma
        DateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");

        System.out.println("time is L"+sdf.format(time1));
           
        }catch(Exception eobj)
        {
            System.out.println(eobj);
        }
    }
}
