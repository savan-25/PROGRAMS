//5.	Create an Voting System Core Application with user Input
// if age<18 then throw an InvalidVoterException.

import java.util.Scanner;

class AgeInvalidException extends Exception
{
   public AgeInvalidException(String str)
   {
    super(str);
   }
}

class Exception1
{
    public static void main(String Arg[])
    {
        int Age = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the your Age");
        Age = sobj.nextInt();

        try
        {
             if(Age <18)
            {   
             AgeInvalidException aobj = new AgeInvalidException("Your Age is less than 18");
             throw aobj;
            }
            else
            {
                System.out.println("you are Eleogible for Voting");
            }
       }
        catch(AgeInvalidException obj)
        {
          
            System.out.println(obj);
        }

       
    

}
}