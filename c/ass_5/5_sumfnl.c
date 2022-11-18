// Write a C program to calculate the Sum of First
// and the Last Digit of a given Number. 
// For example if the number is 1234 the result is
// 1+4 = 5.

#include <stdio.h>

int main()
{
	int num;

	printf("Enter the number : ");
	scanf("%d", &num);

	int first_num, last_num = num%10, temp = num;

	do{
		first_num = num%10;
	}while(num /= 10);	

	printf("\nSum of first and last number of %d: \n", temp);
	printf("-> %d + %d = %d \n", first_num, last_num, first_num+last_num);

	return 0;
}



























	// int len; char mystr[10];           \033[1;31m
	// len = sprintf(mystr, "%d", num); 