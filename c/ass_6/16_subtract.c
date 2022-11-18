// Write a C program to find subtraction of two matrices 
// i.e. matrix_A - matrix_B=matrix_C.
// Input number of rows and number of cols from user for both A and B matrix.
// Now input all rows*cols values from user
// If the given martix are
// 2 3 5  1 5 2
// 4 5 6  2 3 4
// 6 5 7  3 3 4
// Output will be:
// 1 -2 3
// 2 2 2
// 3 2 3
// The elements of the output matrix are separated by one blank space

#include <stdio.h>

int main(){
    int a[3][3], b[3][3], c[3][3];

    for (int i = 0; i < 3; i++)
        for (int  j = 0; j < 3; j++)
            scanf("%d", &a[i][j]);

    printf("\n");
    for (int i = 0; i < 3; i++)
        for (int  j = 0; j < 3; j++)
            scanf("%d", &b[i][j]);  
        
    for (int i = 0; i < 3; i++)
        for (int  j = 0; j < 3; j++)
            c[i][j] = a[i][j] - b[i][j];

    printf("\n");
    for (int i = 0; i < 3; i++){
        for (int  j = 0; j < 3; j++)
            printf("%d ", c[i][j]);
        printf("\n");
    }
    return 0;
}