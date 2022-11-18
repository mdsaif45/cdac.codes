// Write a C Program to delete duplicate elements from an array of integers.
// First take n as size of first array, then input all n elements of first array.
// Now delete duplicate elements from nested array. You can use nested
// loop for deleting duplicate elements.

#include <stdio.h>

int main()
{
	int t; scanf("%d", &t);

	int a[t];
	for (int i = 0; i < t; ++i)
		scanf("%d", &a[i]);

	for (int i = 0; i < t; i++){
		// if(a[i]==a[t-1]){ t--; }
		for (int  j = i+1; j < t; j++)		
			if(a[i]==a[j]){
				for (int k = j; k < t-1; k++)			
					a[k] = a[k+1];
				t--;		
			}
	}		
	for (int i = 0; i < t; i++)
		printf("%d ", a[i]);
	
	return 0;
}