public class Equlas {
    
    public static void main(String args[])
    {   
        /*
         * In Java, the == operator is used to compare references, not the actual content of the strings. 
         * When you use == to compare two strings,
         *  it checks whether the two string objects refer to the same memory location.
         * 
         * In Simple Word equals Method are used for Content Checking and == used for checking reference
         */
        String s1 = "Savan";
        String s2 = "Savan";
        String s3 = new String("Savan");


        if(s1 == s2)
        {
            System.out.println("S1 and S2 both are equal");
        }
        else{
            System.out.println("Both are not Equal");
        }

        if(s1 == s3)
        {
            System.out.println("s1 and s3 are equal");
        }else{
            System.out.println("s1 and s3 are not equal");
        }

        if(s1.equals(s3))
        {
            System.out.println("using equals method s1 and s3 are equal");
        }
    }
}
