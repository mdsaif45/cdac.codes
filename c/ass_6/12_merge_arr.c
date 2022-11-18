// Write a C program to read Two One Dimensional Arrays of same data type
// (integer type) and merge them into another One Dimensional Array of same type.
// First take n as size of first array, then input all n elements of first array.
// Take m as size of second array, then input all m elements of second array.
// At last merge these two arrays to make third array of size n+m

#include <stdio.h>

int main(int argc, char const *argv[])
{
	int n; scanf("%d", &n);

	int a[n];
	// printf("Enter the elements : ");
	for (int i = 0; i < n; ++i)
		scanf("%d", &a[i]);
	

	int m; scanf("%d", &m);

	int b[m];
	// printf("Enter the elements : ");
	for (int i = 0; i < m; ++i)
		scanf("%d", &b[i]);
		
	int s=n+m, c[s];
	for (int i = 0; i < n; ++i)	
	  	c[i] = a[i];	
	
	for (int i = n, j=0; i < m, j<m; ++i,j++)	
	  	c[i] = b[j];	
	
	printf("\n");
	for (int i = 0; i < s; ++i)	
	  	printf("%d\n", c[i]);
	return 0;
}