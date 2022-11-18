// Develop a C program to add two operands and store the result in one of the
// operand using addition assignment operator.

#include <stdio.h>

int main()
{
    int a, b;

    printf("Enter two numbers : ");
    scanf("%d%d", &a, &b);

    a += b;

    printf("\nAddition: a + b = %d\n", a);
    return 0;
}
