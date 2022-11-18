// Write a C Program to Count Number of Uppercase and Lowercase Letters in a given string. 
// The string may be a word or a sentence

#include <stdio.h>
#include <string.h>

int main()
{
	int up_c=0, low_c=0;
	char str[100]; // = "Hello from CDAC hyderabad";
	fgets(str, 100, stdin);
	for (int i = 0; i < strlen(str); ++i)
	{
		//check for lowercase
		if(str[i] >= 97 && str[i] <= 122)
			low_c++;
		//check for uppercase
		if(str[i] >= 65 && str[i] <= 90)
			up_c++;
	}
	printf("\nUppercase Letters : %d\n", up_c);
	printf("Lowercase Letters : %d\n", low_c);

	return 0;
}