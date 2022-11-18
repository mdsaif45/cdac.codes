// Write a C Program to print Binary Equivalent of an Integer using Recursion

#include <stdio.h>

int binary(int num){
    if(num == 0)
        return 0;
    else 
        return num%2 + 10 * binary(num/2);
}

int main()
{
    int num;

    printf("Enter the number : ");
    scanf("%d", &num);

    printf("\n Binary(%d) : %d\n", num, binary(num));
    return 0;
}
