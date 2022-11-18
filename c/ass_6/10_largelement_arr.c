// Write a C Program to find Largest Element of an Integer Array.
// Here the number of elements in the array ‘n’ and the elements of
// the array is read from the test data.
// Use the printf statement given below to print the largest element.
// printf("Largest element = %d", largest);

#include <stdio.h>

int main()
{
	int t;
	scanf("%d", &t);

	int a[t], max=-1000;
	// printf("Enter the elements : ");

	for (int i = 0; i < t; ++i)
	{
		scanf("%d", &a[i]);
		if(max < a[i])
			max = a[i];
	}

	printf("Largest element = %d\n", max);
	return 0;
}