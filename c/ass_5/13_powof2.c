// Write a C program to check whether the given number(n) 
// can be expressed 512 as Power of Two (2) or not.

#include <stdio.h>

int main()
{
	int num;

	printf("Enter the number : ");
	scanf("%d", &num);

	int temp = num;

	do num/=2;
	while (num%2==0);
	
	if(num==1)
	  printf("%d is a number that can be expressed as power of 2.\n", temp);
	else
	  printf("%d cannot be expressed as power of 2.\n", temp);
	
	return 0;
}