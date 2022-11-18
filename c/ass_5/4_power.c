// Write a C program to find power of a number using
// while loops. The base number (>0) and exponent
// (>=0) is taken from the test cases.

#include <stdio.h>

int main()
{
	int num, power;

	printf("Enter a base, power : ");
	scanf("%d%d", &num, &power);

	if(num<=0){ printf("\nBase should be greater than 0\n"); return 0; }
	if(power<0){ printf("\nExponent should greater than equal to 0\n"); return 0; }

	int pow=1, temp=power;
	while(power--){
		pow = pow * num;
	}
	printf("\nResult (%d^%d) : %d\n", num, temp, pow);

	return 0;
}