// Using #define, declare a value, say PI = 3.14, and use it to calculate area of a circle,
// given the radius.

#include <stdio.h>
#define PI 3.14

int main(){
	int radius;

	printf("Enter the radius : ");
	scanf("%d", &radius);

	printf("\nArea of circle : %.3f\n", PI*radius*radius);
	return 0;
}