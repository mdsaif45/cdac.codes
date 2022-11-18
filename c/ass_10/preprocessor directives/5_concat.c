// Concat two numbers to create a single number using ## operator:

#include <stdio.h>
#define CAT(x, y)printf("\n%d\n", x##y);

int main(){

	CAT(123, 456)

	return 0;
}