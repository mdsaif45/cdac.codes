// Write a program to calculate volume of a sphere with 10-meter radius, using the formula
// 𝑣 = 4/3𝜋𝑟 3 . Write the fraction 4/3 as 4.0f/3.0f (Also Try writing 4/3 and see what
// happens?). Use variable name for 𝜋 as PI and store value as 22.0f/7.0f. Modify same
// program and prompt the user to enter the radius.

#include <stdio.h>
#define PI (float)22/7

int main(){
    int radius=10;

    printf("Enter radius of sphere : ");
    scanf("%d", &radius);

    float volume;
    volume = (float)4/3 * PI * radius * radius * radius;

    printf("\n>> Volume of box : %.2f \n", volume);

    return 0;

}