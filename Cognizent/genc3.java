import java.util.Scanner;

public class genc3 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
       int CSE = 0;
       int ECE = 0;
       int MECH = 0;
        System.out.println("Enter the Number os students placed in CSE :");
        CSE =sobj.nextInt();

         System.out.println("Enter the Number os students placed in ECE :");
        ECE =sobj.nextInt();

         System.out.println("Enter the Number os students placed in MECH :");
        MECH =sobj.nextInt();
        sobj.close();

        // if any integer is negative ,print message and exit
        if(CSE < 0 || ECE < 0 || MECH < 0)
        {
            System.out.println("input is invalid");
        }
        else
        {
            if( CSE == ECE && ECE == MECH && MECH == ECE)
            {
                System.out.println("Non of the department got the highest placement");
            }

            // First Check any two department got equal placement and it is greater than third
            else if( CSE==ECE && CSE > MECH)
            {
                System.out.println("Highest Placement :");
                System.out.println("CSE");
                System.out.println("ECE");
            }
            else if( CSE==MECH && CSE > CSE)
            {
                System.out.println("Highest Placement :");
                System.out.println("CSE");
                System.out.println("MECH");
            }
            else if( ECE == MECH && CSE < MECH)
            {
                System.out.println("Highest Placement :");
                System.out.println("ECE");
                System.out.println("MECH");
            }
            // Now ,if we reached here all values are distinct
            // Check if one value is greater than both
            else if( CSE > ECE && CSE > MECH)
            {
                System.out.println("Highest Placement :");
                System.out.println("CSE");
            }
            else if(ECE > MECH)
            {
                System.out.println("highest placement");
                System.out.println("ECE");
            }
            else
            {
                System.out.println("Highest Placements");
                System.out.println("MECh");
            }

        }

    }
}
