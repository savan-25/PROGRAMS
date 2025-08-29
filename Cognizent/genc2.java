
/*Problem Statement – Ritik wants a magic board, which displays a character for a corresponding number for his science project. Help him to develop such an application.
For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
[Assume the number of inputs should be always 4 ]

Sample Input 1:

Enter the digits:
65
66
67
68
Sample Output 1:

65-A
66-B
67-C
68-D */

import java.util.Scanner;

public class genc2 {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        
        int a = sobj.nextInt();
        int b = sobj.nextInt();
        int c = sobj.nextInt();
        int d = sobj.nextInt();

        char q = (char) a;
        char w = (char) b;
        char e = (char) c;
        char r = (char) d;

        System.out.println();
        System.out.print(a);
        System.out.println("-"+q);

        System.out.print(b);
        System.out.println("-"+w);

        System.out.print(c);
        System.out.println("-"+e);

        System.out.print(d);
        System.out.println("-"+r);
    }
}
