#include <stdio.h>

int main()
{
	int i;
	char s[] = "How is your exam";
	for (int i = 0; s[i] != '\0'; ++i)
	{
		// to print "Hwi orea" the condition should be i%2==0
		if(i%2==0){
			printf("%c", s[i]);		//output : Hwi orea
		}
	}
	return 0;
}