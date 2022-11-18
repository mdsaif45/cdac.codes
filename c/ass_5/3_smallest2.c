// Write a C Program to find the Smallest Integer among
// Three integers using IF and Logical && operator.

#include <stdio.h>

int main()
{
	int a, b, c;

	printf("Enter the three numbers : ");
	scanf("%d%d%d", &a, &b, &c);

	int min;
	if(a<c && a<b)
		min = a;
	else if(b<a && b<c)
		min = b;
	else
		min = c;

	printf("\n%d is the smallest number.\n", min);
	return 0;
}

