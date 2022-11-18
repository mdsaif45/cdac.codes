// Write a C program to reverse an array by swapping the elements and without using any new array

#include <stdio.h>

int main(){
    int t; scanf("%d", &t);
    int arr[t];

    for (int i = 0; i < t; i++)
        scanf("%d", &arr[i]);
    
    for (int i = 0, k = t-1; i < t/2; ++i, --k) { 
        int t = arr[i];
        arr[i] = arr[k];
        arr[k] = t;
    }
    printf("\nReversed array elements are : \n");
    for (int i = 0; i < t; i++)
        printf("%d ", arr[i]);

    printf("\n");
    return 0;
}