#include <stdio.h>
#include <string.h>

int main()
{
	static char str1[] = "dills";
	static char str2[20];
	static char str3[] = "daffo";
	int i;

	// strcmp function - string match then return 0 else then return non-zero .. 
	// i = 0 , string match
	i = strcmp(strcat(str3, strcpy(str2, str1)), "daffodills");

	// print 0
	printf("%d\n", i);  

	return 0;
}