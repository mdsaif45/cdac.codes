#include <stdio.h>
void fu(int x, int y);

int main(int argc, char const *argv[])
{
	char x=67, y='C';	// ASCII value of C = 67 assign to var y
	
	fu(x, y);			// calling fu with passing values(67, 67)

	return 0;
}

void fu(int x, int y){
	printf("%d, %d\n", x, y);	//print 67, 67
}