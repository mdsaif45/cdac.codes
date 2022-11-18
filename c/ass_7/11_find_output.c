#include <stdio.h>
#include <string.h>

int main()
{
	char p[] = "assignment";
	char t;
	int i, j;
	
	// swapping of char array or reversing array
	for (int i = 0, j = strlen(p); i<j ; i++)
	{
		t = p[i];
		p[i] = p[j-i];
		p[j-i] = t;
	}
	
	// '\0' or null char use to represent end of the character string. 

	// during the reversing elements of array the '\0' null character cames at first
	// location p[0] = '\0' and '\0' also shows the termination of string 
	// that is the reason the it prints nothing on output console 
	printf("%s", p);
	
	return 0;
}