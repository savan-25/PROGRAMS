/*
 Day 26 coding Statement : Write a program to calculate Maximum number of handshakes

Description

Get the number of people in the room as input from the user. Then calculate the maximum number of handshakes possible among that people.
For e.g. If there are N people in the room then the first person has to shake hand with N-1 people and second person has to shake hand with N-1-1 people i.e., N-2 handshakes are possible. Thus, it goes on.

So total hand shakes = N-1 + N-2 + N-3 +………+1 + 0

Input
10

Output
45
 */

 /*
  * In this Application we are going to take input using BufferedReader
    
  1.What is BufferedReader?
   A class from java.io package used to read text efficiently
   works faster than Scanner for large inputs because it uses internal buffer

   BufferedReader br =  new BufferedReader(new inputStreamReader(System.in));

   System.in : standerd input
   In - Converts byte stream to character
   BufferedReader : Buffers character for faster input



   🧠 What is Buffering?
Buffering is the process of temporarily storing data in memory (called a buffer) before it's processed.

✅ Why is buffering used?
Buffering helps to:

Reduce the number of I/O operations, which are slow.

Improve performance when reading or writing large amounts of data.

✅ Real-Life Example:
Imagine you're filling a water bottle from a tap:

Without buffer: You pour directly from the tap into the bottle every time → slow and inefficient.

With buffer: You fill a bucket first (buffer), and then fill bottles from it → faster and smoother.

Similarly, in programming:

Reading character-by-character from keyboard/disk = slow

Reading a chunk into a buffer and then processing it = fast

🔧 How It Works in Java:
🔹 Without Buffering:
Using System.in.read() reads one byte at a time from the input stream — very slow!

java
Copy code
int ch = System.in.read();  // reads a single character (byte)
🔹 With Buffering:
Using BufferedReader reads a block of characters at once, stores them in a buffer, and serves them as needed.

java
Copy code
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String line = br.readLine(); // efficient, reads from buffer
📌 Summary
Term	Meaning
Buffer	A temporary memory area
Buffering	The act of storing data temporarily
Purpose	To speed up input/output operations
Example	BufferedReader, BufferedWriter

🧠 Interview Tip:
“Buffering is a technique used to temporarily store input/output data in memory to reduce the number of direct I/O operations, making the process faster and more efficient.”


  */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Day26 {
    public static int CalCulateHandShake(int No)
    {
        if(No == 1)
        {
            return 1;
        }

        return (No-1)+CalCulateHandShake(No-1);
    }
    public static void main(String[] args) throws Exception{
        
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        int Person = 0;

        System.out.println("Enter the Number of Persons in the Room");
        Person = Integer.parseInt(bobj.readLine());

        int iRet = CalCulateHandShake(Person);

        System.out.println("Total Number of handshake is :"+iRet);

    }
}
