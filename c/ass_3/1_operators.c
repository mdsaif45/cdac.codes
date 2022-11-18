// Develop a C program to perform operations (+,*,-, / and %) on two
// whole numbers. Identify suitable data types to represent the numbers and
// resultant values

#include <stdio.h>

int main()
{
    int a, b; 

    printf("Enter two numbers : ");
    scanf("%d%d", &a, &b);

    printf("\n%d + %d = %.2f\n", a, b, (float)a+b);
    printf("%d - %d = %.2f\n", a, b, (float)a-b);
    printf("%d * %d = %.2f\n", a, b, (float)a*b);
    printf("%d / %d = %.2f\n", a, b, (float)a/b);
    printf("%d %% %d = %d\n", a, b, a%b);

    return 0;
}
