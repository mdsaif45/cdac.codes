#include <stdio.h>

int main()
{
	int p,t;
	float r,si;

	p = 5000; t=4; r=7.5;
	si=(p*t*r)/100.0;

	printf("%.2f\n", si);
	return 0;
}