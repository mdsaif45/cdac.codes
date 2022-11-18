// Write a program in C to read the file and store the lines into an array.
// Test Data :
// Input the file name to be opened : test.txt
// Expected Output :
// The content of the file output.txt are :
// Line 1
// Line 2
// Line 3


#include <stdio.h>

int main(){
	FILE *file;
	char s[50], c;

	file = fopen("output.txt", "r");

	if(file == NULL){
		printf("File not found\n" );
		return -1;
	}
	int i=0;
	while ((c = getc(file)) != EOF){ 
		s[i] = c; i++;
	}

	printf("%s\n", s);

	return 0;
}

