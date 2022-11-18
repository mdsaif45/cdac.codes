// Write a program to swap two numbers.

#include <stdio.h>

int swap(int *a, int *b){

	int t = *a;
	*a = *b;
	*b = t;
}

int main(){

	int a, b;
	printf("Enter the two numbers : ");
	scanf("%d%d", &a, &b);

	printf("Before swapping : a = %d, b = %d \n", a, b);
	swap(&a, &b);
	printf("After  swapping : a = %d, b = %d \n", a, b);
	return 0;
}