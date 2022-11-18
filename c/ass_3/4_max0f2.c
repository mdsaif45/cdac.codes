// Write a C program to find the maximum of 2 numbers using Conditional
// operator.

#include <stdio.h>

int main()
{
    int a, b, max;

    printf("Enter two numbers : ");
    scanf("%d%d", &a, &b);

    max = a>b ? a : b;
    
    printf("\nmaximum is %d\n", max);
    return 0;
}
