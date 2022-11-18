// Write a C program to fin sum of following series
// where the value of n is taken as input:
// 1+ 1/2 + 1/3 + 1/4 + 1/5 + .. 1/n

#include <stdio.h>

int main()
{
	int num; float sum = 0.0;

	printf("Enter the number : ");
	scanf("%d", &num);

	for (int i = 1; i <= num; ++i){
		sum = sum + (float)1/i;
	}
	
	printf("Sum of the series is : %.2f\n", sum);
	return 0;
}