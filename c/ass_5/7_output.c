#include <stdio.h>

int main(int argc, char const *argv[])
{
	int a=1;
	
	if(a--)					//a=1 true then a= 0
		printf("True\n");	///print true
	if(++a)					//a=1 true
		printf("False\n");	//printf False
	
	return 0;
}