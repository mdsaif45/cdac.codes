// Write a C Program to find power of a given number using recursion. 
// The number and the power to be calculated is taken from test case

#include <stdio.h>

int power(int num, int pw){
    if(pw == 0)
        return 1;
    else      
        return num * power(num, pw-1);
}

int main()
{
    int num, pw;
    printf("Enter the number and power : ");
    scanf("%d%d", &num, &pw);

    printf("\n %d^%d: %d\n", num, pw, power(num, pw));


    return 0;
}
