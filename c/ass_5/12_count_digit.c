// Write a C program to count total number of digits of an
// Integer number (n).

#include <stdio.h>

int main()
{
	int num;

	printf("Enter the number : ");
	scanf("%d", &num);

	int count=0, temp=num;
	do
	{
		count++;
	} while (num/=10);

	printf("the number %d contains %d digits.\n", temp, count);
	return 0;
}