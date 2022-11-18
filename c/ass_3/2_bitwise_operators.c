// Write a program to demonstrate bitwise operators

#include <stdio.h>

int main()
{
    int a, b;

    printf("Enter two numbers : ");
    scanf("%d%d", &a, &b);

    // Bitwise Operators
    printf("\n~%d = %d\n", a, ~a);  
    printf("~%d = %d\n", b, ~b);
    printf("%d ^ %d = %d\n", a, b, a^b);
    printf("%d & %d = %d\n", a, b, a&b);
    printf("%d | %d = %d\n", a, b, a|b);
    printf("%d >> %d = %d\n", a, b, a>>b);
    printf("%d << %d = %d\n", a, b, a<<b);
    return 0;
}
