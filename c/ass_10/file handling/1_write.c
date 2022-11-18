// Write a program in C to write multiple lines in a text file.
// Test Data :
// Input the number of lines to be written : 4
// The lines are
// test line 1
// test line 2
// test line 3
// Expected Output :
// The content of the file test.txt is :
// test line 1
// test line 2
// test line 3

#include <stdio.h>
#include <stdlib.h>

int main(){

	FILE *file = fopen("output.txt", "w");
	
	if (file == NULL){
		printf("fail to open!");
		return -1;
	}
	char s[100]; int line;

	printf("Input the number of lines to be written : ");
	scanf("%d", &line);

	for(int i=0; i<line+1; i++){
		fgets(s, sizeof(s), stdin);
		fputs(s, file);
	}
	
	fclose(file);
	return 0;
}
