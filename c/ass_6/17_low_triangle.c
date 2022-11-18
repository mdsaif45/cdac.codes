// Write a C program to print lower triangle of a square matrix.
// Input size of square matrix as n. Solve of nxn square matrix
// For example the output of a given matrix
// 2 3 4 will be 2 0 0
// 5 6 7         5 6 0
// 4 5 6         4 5 6

#include <stdio.h>

int main(){
    int arr[3][3], k=1;

    for (int i = 0; i < 3; i++)
        for (int  j = 0; j < 3; j++)
            scanf("%d", &arr[i][j]);

    printf("\n");
    for (int i = 0; i < 3; i++){
        for (int  j = 0; j < 3; j++){
            if(j<k)
                printf("%d ", arr[i][j]);
            else
                printf("0 ");
        }
        printf("\n"), k++;
    }
    return 0;
}