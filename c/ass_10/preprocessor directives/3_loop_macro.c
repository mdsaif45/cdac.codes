// Write a for loop to print numbers from 1 to 20. The for loops has to be written as a
// multiline macro

#include <stdio.h>
#define forlo(x, y)				\ 
	{							\ 
		for(int i=x; i<=y; ++i) \
		  printf("%d\n", i);		\ 
		printf("\n");			\
	}							\

int main(){
	forlo(1, 20)
	return 0;
}