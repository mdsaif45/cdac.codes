// Write a C program to check if a given Number is zero or
// Positive or Negative Using if...else statement.

#include <stdio.h>

int main()
{
    float val;
    printf("Enter value : ");
    scanf("%f", &val);
    
    if(val>0)
        printf("%.2f is positive number\n", val);
    else if(val<0)
        printf("%.2f is negetive number\n", val);
    else
        printf("Number is zero\n");
        
    return 0;
}
