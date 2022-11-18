#include <stdio.h>

int factorial(int);

int main()
{
	int n=10;
	long int f;

	f = factorial(n);	//function calling
	printf("%d! = %ld\n", n, f);
	
	return 0;
}
// factorial func is called only one times which means fuctions executed one times only.
int factorial(int n){
	if(n==0)
		return 1;
	else
		return n*factorial(n-1);
	
}