// Write a program that asks the user to enter a value for x and then displays the value of the
// following polynomial: 6𝑥 5 + 5𝑥 4 − 4𝑥 3 + 3𝑥 2 + 2𝑥 + 1

#include <stdio.h>
#include <math.h>

int main(){
    int x, y;

    printf("Enter value of x : ");
    scanf("%d", &x);

    y = 6*pow(x, 5) + 5*pow(x, 4) - 4*pow(x, 3) + 3*pow(x, 2) + 2*x + 1;

    printf("\n-> y = 6x^5 + 5x^4 - 4x^3 + 3x^2 + 2x + 1 \n-> y = %d\n", y);

    return 0;

}