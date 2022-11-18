// Define a variable inside a header file, say “custom.h”, use this header file in your
// program and then print the value of the variable defined in custom.h.

#include <stdio.h>
// inside of custom.h 
// float PI = (float)22/7;
#include "1_custom.h"

int main(){

	printf("The PI value : %f\n", PI);
	printf("The e value  : %f\n", e);
	printf("speed of light : %d m/s\n", light_speed);
	return 0;
}

// Output : The PI value is 3.142857
