// Write a C Program to find the Largest Integer among Three
// integers using if statement.
// Note: To take input using single line Use 
// scanf(“%d %d %d”, &num1, &num2, &num3);

#include <stdio.h>

int main()
{
    float val1, val2, val3;

    printf("Enter 3 numbers : ");
    scanf("%f %f %f", &val1, &val2, &val3);

    float max = val1>val2 && val1>val3 ? val1 : val2>val1 && val2>val3 ? val2 : val3;

    printf("\n%.0f is greatest in all\n", max);
    

    return 0;
}































    // if(val1>val2 && val1>val3)
    //     printf("\n%.0f is greatest in all\n", val1);
    // else if(val2>val1 && val2>val3)
    //     printf("\n%.0f is greatest in all\n", val2);
    // else
    //     printf("\n%.0f is greatest in all\n", val3);   

