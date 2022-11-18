#include <stdio.h>

int main()
{
	char str1[] = "Week-7-Assignment";
	char str2[] = {'W', 'e', 'e', 'k', '-', '7', '-', 'A', 's', 's', 'i', 'g', 'n', 'm', 'e', 'n', 't'};

	//str1 carries string which contain nullchar in the end 17+1
	//str2 is array of char ..size=no of char here 17
	int n1 = sizeof(str1)/sizeof(str1[0]); // 18
	int n2 = sizeof(str2)/sizeof(str2[0]); // 17
	
	printf("n1 = %d, n2 = %d\n", n1, n2); //prints n1 = 18, n2 = 17
	
	return 0;

}