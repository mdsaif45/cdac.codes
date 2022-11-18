// Write a C Program to reverse a given word using function.
// e.g. INDIA should be printed as AIDNI

#include <stdio.h>
#include <string.h>

int main()
{
	char d[20]; 
	
	printf("Enter the string : ");
	scanf("%[^\n]s", d);

	int l = strlen(d)-1;

	printf("The string after reverse : ");
	while(l >= 0){
		printf("%c", d[l]);
		l--;
	}
	printf("\n");
	
	return 0;
}