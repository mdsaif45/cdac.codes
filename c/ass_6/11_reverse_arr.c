// Write a C Program to print the array elements in reverse order (Not
// reverse sorted order. Just the last element will become first element,
// second last element will become second element and so on)
// Here the size of the array, ‘n’ and the array elements is accepted from the
// test case data.

#include <stdio.h>

int main()
{
	int t;
	scanf("%d", &t);

	int a[t];
	printf("Enter the elements : ");

	for (int i = 0; i < t; ++i){
		scanf("%d", &a[i]);
	}

	//printing array in reserve order
	printf("\nReverse elements   : ");
	while(t--){
		printf("%d ", a[t]);
	}

	printf("\n");
	return 0;
}