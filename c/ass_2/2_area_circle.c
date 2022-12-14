// Write a program to calculate area and circumference of a circle using formula: ππππ = ππ 2
// and πππππ’ππππππππ = 2πr. Take the input r from the user.
// Note: C doesnβt have an exponentiation operator, so that you will need to multiply x by itself
// repeatedly to compute powers of x. (For example, π₯ β π₯ ππ  π₯ 2 )

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