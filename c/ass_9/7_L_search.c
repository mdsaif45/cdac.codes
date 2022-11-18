// Write a C program to search a given element from a 1D array and display 
// the position at which it is found by using linear search function. The index location starts from 1.

#include <stdio.h>
#include <stdlib.h>

int main(){ 
    int t; scanf("%d", &t);
    int arr[t];

    for (int i = 0; i < t; i++)
        scanf("%d", &arr[i]);
    
    int search;
    scanf("%d", &search);

    for (int i = 0; i < t; i++)
        if(search == arr[i])
            printf("\n%d is present at location : %d\n", search, i+1), exit(0);       
    
    printf("\n%d is not present in the array\n", search);
    return 0;
}