// Write a program to calculate simple interest using formula: 𝑠𝑖 = 𝑝𝑟𝑖𝑛𝑐𝑖𝑝𝑙𝑒 ∗ 𝑟𝑎𝑡𝑒 ∗ 𝑡𝑖𝑚𝑒/100.
// Take all variable as float type.

#include <stdio.h>

int main(){
    float SI, principle, rate, time;

    printf("Enter principle : ");
    scanf("%f", &principle);
    printf("Enter rate : ");
    scanf("%f", &rate);
    printf("Enter time : ");
    scanf("%f", &time);

    SI = principle * rate * time /100;
   
    printf("\n-> Simple Interest = %.2f\n", SI);

    return 0;

}