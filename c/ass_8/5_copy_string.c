// Write a c program to copy string without using library functions

#include <stdio.h>

void copys(char a[], char s[], int n){
	for (int i = 0; i < n; ++i)
		s[i] = a[i];
}

int main(){

	char a[] = "Welcome to Future", s[10];
	
	copys(a, s, sizeof(a));

	printf("%s\n", s);
	return 0;
}