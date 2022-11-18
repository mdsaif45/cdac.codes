// Write a C program to calculate volume of a box. A box can be represented by three
// quantities: length, width and height in inches. Volume can be calculated as:
// volume = height * length * width
// Take the input from user (using scanf) and print the volume as a result. Use float data
// types for all variables

#include <stdio.h>

int main(){
    int length, breadth, hight;

    printf("Enter dimension of box (L,B,H) : ");
    scanf("%d %d %d", &length, &breadth, &hight);

    int volume;
    volume = length * breadth * hight;

    printf("\n>> Volume of box : %d \n", volume);

    return 0;
}