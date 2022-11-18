// Write a program to use exp function from math.h

#include <stdio.h>
#include <math.h>

int main(){
    double num;

    printf("Enter the number : ");
    scanf("%lf", &num);

    printf("\nexp (%.2lf) : %.4lf\n", num, exp(num));

    return 0;
}