// these Program Demonstrate the Difference between character Stream and Byte Stream

import java.io.*; 
public class File3 {
    public static void main(String srgs[])
    {
            try
            {
                FileReader fr = new FileReader("File3.java");
                FileWriter fw = new FileWriter("copy.txt");

                int i = 0;

                while( (i = fr.read() )!= -1)
                {
                  fw.write(i);
                }
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
