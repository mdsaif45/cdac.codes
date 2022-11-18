// Write a c program to find length of string without using library functions

#include <stdio.h>

int main(){

	char a[] = "Programmer";
	int size=0;

	for (int i = 0; a[i] != '\0' ; ++i)
		size++;
	
	printf("String : %s\n", a);
	printf("size of string : %d\n", size);
	return 0;
}