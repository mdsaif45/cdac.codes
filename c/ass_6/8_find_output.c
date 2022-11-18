#include <stdio.h>

int main()
{
	int i = 0;
	char c = 'a';

	while(i < 5){
		i++;
		switch(c){
			case 'a': printf("%c\n", c);  //5 times
					  break;
		}
	}
	printf("a\n");  //1 time 

	//-> total 6 times 'a' will print
	return 0;
}