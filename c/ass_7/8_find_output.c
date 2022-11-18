#include <stdio.h>
#include <string.h>

int main()
{
	char str1[20] = "hello", str2[20] = " world";

	// strcat - concat both var string into str1
	// strcpy - copy 2nd arg string into str2
	
	printf("%s\n", strcpy(str2, strcat(str1, str2))); 
	//str1 = "hello world" and string copy to var str2 and then it prints "hello world"
	
	return 0;
}