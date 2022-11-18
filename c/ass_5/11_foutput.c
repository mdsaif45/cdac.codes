#include <stdio.h>

int main()
{
	
	int i=0,j=1; 

	printf("%d\n", i++&&++j);  // 0 && 1 = 0
	printf("%d %d\n", i, j);   // i=1 j=1
	
	return 0;
}

