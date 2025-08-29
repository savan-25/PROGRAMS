
//Check input is Alphabet or not
#include <stdio.h>
#include <stdbool.h>

// Function to check if the character is an alphabet
bool Check(char ch)
{
    if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) // Correct condition
    {
        return true;
    }
    return false; // Explicit return for non-alphabetic characters
}

int main()
{  
    char cValue = '\0';
    printf("Enter the character: ");
    scanf("%c", &cValue);

    // Call the Check function
    bool c = Check(cValue);

    if (c == true)
    {
        printf("The character is an alphabet.\n");
    }
    else
    {
        printf("The character is not an alphabet.\n");
    }
    return 0;
}
