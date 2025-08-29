// String is Sequence of Character
// String is immutable in Nature means we cant change the original string
// if we want do any operation on original string then we need to create new String
// we accept the input using two ways 
// 1.Scanner   2. BufferedReader()
// Scanner - it is ideal for reading small amounts of data or for interactive console input.
// it is user-friendly and comes with built in methods for parsing different type of data(like nextInt() , nextDouble() , nextLine())

// BufferedReader() : large amount of efficiently.it reads text from input stream and store in a buffer

// example of BufferedReader

//import java.io.*; // * is wildcard Character

class String1
{
    public static void main(String args[])
    {
        // if we declare string using String class the it is immutable in nature
        //Every modification creates new string

        // if our program needed multiple updation then String Builder is useful-> it is mutable in nature

        StringBuilder sb = new StringBuilder("");

        for(char ch='a' ;ch <='z';ch++)
        {
            sb.append(ch);
        }

        //O(26)
        //O(26*n^2)

        System.out.println(sb);
    }
}

