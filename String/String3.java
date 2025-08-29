import java.util.Scanner;

public class String3 {
    public static int wLength(String str) {
        int end = str.length() - 1;
        int iCount = 0;

        // Edge case: if string is empty
        if (str.length() == 0) {
            return 0;
        }

        while (end >= 0 && str.charAt(end) != ' ') {
            iCount++;
            end--;
        }
        return iCount;
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sobj.nextLine();

        str = str.trim(); // remove leading/trailing spaces

        int Len = wLength(str);

        System.out.println("Length of last word: " + Len);
    }
}
