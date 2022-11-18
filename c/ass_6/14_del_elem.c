// C Program to delete an element from a specified location of an Array starting 
// from array [0] as the 1st position, array[1] as second position and so on.

#include <stdio.h>

int main()
{
	int t; scanf("%d", &t);

	int a[t];
	for (int i = 0; i < t; ++i)
		scanf("%d", &a[i]);

	int pos; scanf("%d", &pos);

	for (int i = pos; i < t; ++i)
	{
		int temp = a[i];
		a[i] = a[i+1];
		a[i+1] = temp;

	}
	printf("\n");
	for (int i = 0; i < t-1; ++i)
	{
		printf("%d\n", a[i]);
	}

	return 0;
}