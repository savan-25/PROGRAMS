// java program to create new file
// There are two ways in java to create file:
//1.using file class -> file.createNewFile()
//2using FileoutputStream

import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Creating_NewFile {

    public void NewFile()
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the Name of file :");

            // reading file name
           String strname = br.readLine();

           System.out.println("Enter the File path");
           String strpath = br.readLine();

           //creating file object
           File fobj = new File(strpath+"\\"+strname+".txt");

           //method to create new file
           fobj.createNewFile();

           if(fobj.exists())
           {
            System.out.println("File get succesfully created");
           }
           else
           {
            System.out.println("unable to create new file");
           }
        }catch(Exception eobj)
        {
            System.out.println("Exception caught :"+eobj);
        }
    }
    public static void main(String args[])
    {
        
       Creating_NewFile nobj =new Creating_NewFile();
       nobj.NewFile();
    }
}
