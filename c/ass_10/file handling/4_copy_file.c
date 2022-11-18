// Write a program in C to copy a file in another name.
// Assume that the content of the file test.txt is :
// test line 1
// test line 2
// test line 3
// Test Data :
// Input the source file name : test.txt
// Input the new file name : test1.txt
// Expected Output :
// The file test.txt copied successfully in the file test1.txt.
// If you read the new file you will see the content of the file :
// test line 1
// test line 2
// test line 3

#include <stdio.h>

int main(){
	FILE *file_s, *file_d;
	char s[50], source[10], dest[10], c;
	printf("Enter source file name : ");
	scanf("%s\n", source);
	printf("Enter destination file name : ");
	scanf("%s", dest);

	printf("%s\n%s\n", source, dest);
	
	file_s = fopen(source, "r");
	file_d = fopen(dest, "w");

	if(file_s == NULL){
		printf("File not found\n" );
		return -1;
	}
	int i=0;
	while ((c = getc(file_s)) != EOF){ 
		s[i] = c; 
		fputc(c, file_d);
		i++;
	}

	printf("%s\n", s);

	return 0;
}
