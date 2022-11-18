// Write a C program to reverse an array by using another new array

#include <stdio.h>

int main(){
    int t; scanf("%d", &t);
    int arr[t], rev_arr[t];

    for (int i = 0; i < t; i++)
        scanf("%d", &arr[i]);
    
    for (int i = 0, k = t-1; i < t; i++, k--)
        rev_arr[i] = arr[k];

    printf("\nOriginal array elements are : \n");
    for (int i = 0; i < t; i++)
        printf("%d  ", arr[i]);
    
    printf("\n\nReversed array elements are : \n");
    for (int i = 0; i < t; i++)
        printf("%d  ", rev_arr[i]);

    printf("\n");
    return 0;
}