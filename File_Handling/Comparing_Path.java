
// write a java program to compare the path of two files

import java.io.File;
public class Comparing_Path {
     public static void main(String args[])
     {
             File file1 = new File("./Comparing_Path");
             File file2 = new File("./File5.java");
             File file3 = new File("./Comparing_Path");

             // Path Comparinsion
             if(file1.compareTo(file2)==0)
             {
                System.out.println("Path of File1 and File2 are same");
             }
             else{
                System.out.println("path of file 1 and file2 are not same");
             }

             if(file1.compareTo(file3)==0)
             {
                System.out.println("path of file1 and file3 is same:");
             }
     }
}
