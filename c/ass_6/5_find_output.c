#include <stdio.h>

int main(int argc, char const *argv[])
{
	
	int i, a[4]={3, 1, 12, 4}, result;
	result=a[0];

	//find max in array
	for (int i = 0; i < 4; ++i)
	{
		if(result>a[i])
			continue;
		result=a[i];
	}

	//print max value from array
	printf("%d\n", result);

	return 0;
}