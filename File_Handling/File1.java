//  Basic File manipulation
import java.io.File;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) throws IOException
     {
        File f1 = new File("C:/Users/userp/Desktop/MYERA/File_Handling/name1.txt");
        
        f1.createNewFile(); // checked exception
        System.out.println("Is exists : "+f1.exists());
        System.out.println("it can be writable "+f1.canWrite());
        System.out.println("File Size is :"+f1.length());

    }
}
// jo file object bana hai f1 vo file ke metadata ko represent karata hai
