#include <stdio.h>

int main()
{
	int a[6] = {1, 2, 3, 4, 5, 6};

	switch(sizeof(a)){  //return 24, no case matchs 
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:	printf("IIT KGP\n");
				break;
	}

	// print IIT MADRAS
	printf("IIT MADRAS \n");
	return 0;
}