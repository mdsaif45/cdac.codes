// Write a program to calculate area and circumference of a circle using formula: 𝑎𝑟𝑒𝑎 = 𝜋𝑟 2
// and 𝑐𝑖𝑟𝑐𝑢𝑚𝑓𝑒𝑟𝑒𝑛𝑐𝑒 = 2𝜋r. Take the input r from the user.
// Note: C doesn’t have an exponentiation operator, so that you will need to multiply x by itself
// repeatedly to compute powers of x. (For example, 𝑥 ∗ 𝑥 𝑖𝑠 𝑥 2 )

#include <stdio.h>

int main(){
    int radius;
    float area, circumference;
    
    printf("Enter radius of circle : ");
    scanf("%d", &radius);

    area = 22 * radius * radius / 7.0;
    circumference = 2 * 22 * radius / 7.0;

    printf("\n-> Area of circle : %.2f ", area);
    printf("\n-> Circumference of circle : %.2f \n ", circumference);

    return 0;
}