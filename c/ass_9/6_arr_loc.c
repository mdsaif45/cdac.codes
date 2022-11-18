// Write a program to print all the locations at which a particular element (taken as input) is found in a array
// and also print the total number of times it occurs inthe array. The location starts from 1.
// For example if there are 4 elements in the array
// 5
// 6
// 5
// 7
// If the element to search is 5 then the output will be
// 5 is present at location 1
// 5 is present at location 3

#include <stdio.h>

int main(){ 
    int t; scanf("%d", &t);
    int arr[t];

    for (int i = 0; i < t; i++)
        scanf("%d", &arr[i]);
    
    int search, count=0; 
    scanf("%d", &search);
    
    for (int i = 0; i < t; i++)
        if(search == arr[i]){
            printf("%d is present at location : %d\n", search, i+1);
            count++;
        }
        
                
    if(count == 0)
        printf("%d is not present in array \n", search); 
    else        
        printf("%d is present %d times in an array\n", search, count);
    
    return 0;
}
