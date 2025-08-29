// these Program Demonstrate the Difference between character Stream and Byte Stream

import java.io.*;
import java.nio.channels.FileChannel; 
public class File4 {
    public static void main(String srgs[])
    {
            try
            {   
                // file may contain other than character data like image
                // if we use FileReader and FileWriter  then not proper data get copied
                FileInputStream fr = new FileInputStream("savanp.jpeg");
                FileOutputStream fw = new FileOutputStream("pic.jpeg");

                int i = 0;

                while( (i = fr.read() )!= -1)
                {
                  fw.write(i);
                }

               // // to get the unique object of FileChannel for this specified fileInputStream
                FileChannel fileChannel = fr.getChannel();
                System.out.println("Current Size of the File is :"+fileChannel.size());



                fw.flush(); // forcefully write the data
                fw.close();
                fr.close();

                System.out.println("File Coped Succesfully");
            }catch(Exception eobj)
            {
                System.out.println(eobj);

            }
    }
}
// Character Stream                               Byte Stream
// these handles data in 16 bit unicode           thse handles data in bytes(8 bits)
// Commman Classes are FileReader & FileWriter     Commmon class are FileInputStream & FileOutputStream

// Works with character data                         Works With non-character data




// write() method this writes single byte to file ouput stream
// flush()  for clearing OutputStream ,we use the flush method.this method force all data to get stored to its destination
// close() This method close the file.after this we cannot use other method
