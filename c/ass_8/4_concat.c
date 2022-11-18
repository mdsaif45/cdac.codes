// Write a c program to concatenate two strings without using library functions

#include <stdio.h>

int main(){

	char a[] = "Hello", b[] = " world";
	char s[40];

	for (int i = 0, j = 0, k = 0; j<sizeof(b); ++i)
	{

		if(a[i] == '\0')
			continue; 
		
		if(i < sizeof(a))
			s[k] = a[i], k++; 
		
		else
			s[k] = b[j], j++, k++;
		
	}

	printf("%s\n", s);

	return 0;
}