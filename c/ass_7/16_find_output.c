#include <stdio.h>

int main()
{
	int i;
	for (int i = 0; i < 5; i++)	//loop 5 times
	{
		int i=10;				//assign i=10 in every loop
		printf("%d\n", i);		//print 10
		i++;					//10+1
	}
	return 0;
}

// print number 10 five times because before printing variable, 10 is assigning to variable i in every loop