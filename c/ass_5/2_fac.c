// Write a program to find the factorial of a given number
// using while loop
// 5! = 5*4*3*2*1
// 6! = 6*5*4*3*2*1
// 0! = 1
// 1! = 1
// -5! = 1
// -10! = 1

#include <stdio.h>

int main()
{
	double num, fact=1, temp;

	printf("Enter a number : ");
	scanf("%lf", &num);

	temp=num;

	while(num>0){
		fact = fact * num;
		num--;
	}

	printf("\nFactorial of %.0lf : %.0lf\n", temp, fact);

	return 0;
}