// Write a C Program to Find the Smallest Number among
// Three Numbers (integer values) using Nested if-else statement

#include <stdio.h>

int main()
{
	int a, b, c, min;
	printf("Enter the three values : ");
	scanf("%d %d %d", &a, &b, &c);
	
	// if-else ladder
	if(c>a && c>b){     
		if(a>b)
			min = b;
		else
			min = a;
	}
	else if(a>b && a>c){
		if(b>c)
			min = c;
		else
			min = b;
	}
	else if(b>c && b>c){
		if(c>a)	
			min = a;
		else
			min = c;
	}

	printf("%d is smallest\n", min);

	return 0;
}