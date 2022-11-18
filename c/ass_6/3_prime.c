// Write a program in C to find whether a number n is prime number or not

#include <stdio.h>

int main(int argc, char const *argv[])
{
	int num, c=0;

	printf("Enter the number : ");
	scanf("%d", &num);

	for (int i = 1; i < num; ++i)
	{
		if(num%i == 0)
			c++;
	}

	if(c==1 && num!=1)
		printf("%d is prime\n", num);
	else
		printf("%d id not a prime\n", num);
	return 0;
}