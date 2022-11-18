// Write a C program to find the sum of all elements of each row of a matrix.
// Input number of rows and number of cols from user.
// Now input all rows*cols values from user
// Example: For a 3x3 matrix
// 4 5 6
// 6 7 3
// 1 2 3
// The output will be
// 15
// 16
// 6

#include <stdio.h>

int main(){
    int arr[3][3], sum[3]={0, 0, 0};

    for (int i = 0; i < 3; i++)
        for (int  j = 0; j < 3; j++){
            scanf("%d", &arr[i][j]);
            sum[i] += arr[i][j];
        }

    printf ("\n");
    for (int i = 0; i < 3; i++)
        printf ("%d\n", sum[i]);
    
    return 0;
}