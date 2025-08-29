// Writing to file using FileOutputStream
// For Writing data we use FileOutputStream

import java.io.FileOutputStream;
import java.io.IOException;

public class File2 {
    
    public static void main(String args[])  throws IOException
    {
        FileOutputStream fobj = new FileOutputStream("../File_Handling/File2.java",true);

        String str = "Hello";

        char ch[] = str.toCharArray();
         for(int i =0;i<str.length();i++)
         {
            fobj.write(ch[i]);
         }
         fobj.close();// jab tak file close nahi ho rahi tab tak data ram hi hai

    }
}
// writing to file means storing data in file
// it is may possible to arrise Checked exception
// in our code IOException is handled to manage potential issue realated file operations ,
//such as file not being found ,issue with file permission

// jab tak fobj.close( nahi hoti tab tak sare changes Ram Rakhe File me hote)
// file close ho jane ke bad sare changes Actual File (hard Disk) Update ho jate hai
//agar file close hone ke bad kusch operation karna hai to phir object banao