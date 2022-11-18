// Write a C program to print the following Pyramid pattern upto Nth row.
// Where N (number of rows to be printed) is taken as input.

#include <stdio.h>

int main()
{
	int num; 

	printf("Enter the number : ");
	scanf("%d", &num);
	
	int t=num;
	while(num){
		while(t){
			printf("* ");
			t--;
		}
		printf("\n");
		t = --num;
	}

	return 0;
}