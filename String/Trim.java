/*
  String str = "   hello   user  welCome   ";

  o/p :- "hello   user  welCome"
 */
public class Trim {

    public static String Trim(String str)
    {
        String sRet ="";
        int start = 0;
        int end = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) !=' ')
            {
                start = i;
                break;
            }
        }
        for(int i = str.length()-1;i>=start-1;i--)
        {
            if(str.charAt(i) !=' ')
            {
                end = i;
                break;
            }
        }
       // int Count = end-start+1;

        String result = str.substring(start, end+1);

        return result;
    }
    public static void main(String[] args) {
        String str ="   hello   user  welCome   ";

         String Ans = Trim(str);

         System.out.println("After trim String is :"+Ans);
    }
}
/*
 * how the sub string function in work in java


ChatGPT said:
In Java, the substring() method is used to extract a portion of a string. It is a method of the String class and comes in two main forms:

✅ Syntax
java
Copy code
// 1. From startIndex to end of string
String substring(int startIndex);

// 2. From startIndex to endIndex - 1
String substring(int startIndex, int endIndex);
✅ Important Rules
Parameter	Description
startIndex	The beginning index (inclusive). Starts from 0.
endIndex	The ending index (exclusive). The character at this index is not included.
endIndex > startIndex	Otherwise it throws StringIndexOutOfBoundsException.

📘 Example 1: substring(int startIndex)
java
Copy code
String str = "HelloWorld";
String result = str.substring(5);  // From index 5 to end
System.out.println(result);        // Output: World
📘 Example 2: substring(int startIndex, int endIndex)
java
Copy code
String str = "HelloWorld";
String result = str.substring(0, 5); // From index 0 to 4
System.out.println(result);         // Output: Hello
⚠️ Common Errors
java
Copy code
String str = "Hello";

str.substring(2, 1);  // ❌ Invalid: startIndex > endIndex → Runtime Error
str.substring(-1);    // ❌ Invalid: Negative index
str.substring(0, 10); // ❌ Invalid: endIndex > str.length()
All the above throw: StringIndexOutOfBoundsException.

🔍 Real-Life Example: Get file extension
java
Copy code
String fileName = "resume.pdf";
String extension = fileName.substring(fileName.lastIndexOf('.') + 1);
System.out.println(extension);  // Output: pdf
Summary
Expression	Meaning
str.substring(3)	From index 3 to end
str.substring(0, 4)	From index 0 to 3
str.substring(2, 2)	Empty string ("")
str.substring(0, str.length())	Whole string

Let me know if you want to visualize it or apply it to your own program.












ChatGPT can make mistakes. Check important info. See Cookie Preferences.
 */