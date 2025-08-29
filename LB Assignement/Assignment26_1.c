#include <stdio.h>

int main() {
    printf("%-10s %-12s %-10s %-10s\n", "Decimal", "Hexadecimal", "Octal", "Symbol");
    printf("--------------------------------------------------------\n");

    for (int i = 0; i < 256; i++) {
        char symbol = (i >= 32 && i <= 126) ? (char)i : ' '; // Printable characters only
        printf("%-10d %-12x %-10o %-10c\n", i, i, i, symbol);
    }

    return 0;
}
