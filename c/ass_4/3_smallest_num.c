// Write a C Program to find the Smallest Integer among Three
// integers using IF and Logical && operator.

#include <stdio.h>

int main()
{
    float val1, val2, val3;
    printf("Enter 3 numbers : ");
    scanf("%f %f %f", &val1, &val2, &val3);

    float min;

    if(val1<val2 && val1<val3)
        min = val1;
    else if(val2<val1 && val2<val3)
        min = val2;
    else
        min = val3;  
    
    printf("\n%.0f is smallest number\n", min);

    return 0;
}
