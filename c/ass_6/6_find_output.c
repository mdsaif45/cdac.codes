#include <stdio.h>

int main(int argc, char const *argv[])
{
	int arr[] = {1,2,3,4,5,6};
	int i, j, k;

	j = ++arr[2];	//j = 4 
	k = arr[1]++;	//k = 2
	i = arr[j++];	//i = 5 and j = 5

	printf("i = %d, j = %d, k = %d\n", i, j, k);
	return 0;
}