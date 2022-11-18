#include <stdio.h>

// return number 5 with input 5 or less than 5
// return same passing number if greater than 5 
int f(int n){
	static int i=1;
	if(n>=5)
		return n;
	n = n + 1;
	i++;

	return f(n);
}

int main(){
	printf("%d\n", f(10));   // calling funciton f and print return value from f
	return 0;
}