// Write a program to find the GCD (Greatest Common
// Divisor) of 2 (two) numbers using 'for' loop. 
// The two numbers are taken as input from the test cases.

#include <stdio.h>

int main()
{
	int a, b, gcd=1;

	printf("Enter the number : ");
	scanf("%d %d", &a, &b);

	int size = a<b?a:b; 
	for (int i = 1; i <= size; ++i){
			if(a%i == 0 && b%i == 0)
				gcd = i;
	}
	printf("GCD of the numbers %d and %d is %d\n", a, b, gcd);
	return 0;
}