#include <stdio.h>

int main()
{
	int a;
	int arr[5] = {1, 2, 3, 4, 5};

	//arr[1]= ++2 = 3
	arr[1] = ++arr[1]; 

	//a=3 , arr[1]= 3++ = 4
	a = arr[1]++;
	
	//arr[1]= arr[3] = 4, a = 3++ = 4 
	arr[1] = arr[a++];

	printf("%d, %d\n", a, arr[1]);  // a=4, arr[1]=4
	return 0;
}