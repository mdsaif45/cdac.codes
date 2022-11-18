// Write a program to find whether given number is palindrome or not.
// Palindrome number is a number which is same as its reverse

#include <stdio.h>

int main(int argc, char const *argv[])
{
	int num, s=1, rem, pal=0, temp, p=1;

	printf("Enter a number :");
	scanf("%d", &num);

	temp = num;
	//checking place values
	while(num/=10){
		p*=10; 
	}
	
	num = temp;
	//reversing the number
	while(num){
		rem = num%10;
		pal += rem*p;
		p/=10;
		num/=10;
	}

	//comparing reverse number with original
	if(pal == temp)
		printf("%d is palindrome\n", pal);
	else
		printf("%d is not a palindrome\n", pal);
	return 0;
}