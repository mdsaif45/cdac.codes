// Write a program in C to count a number of words and characters in a file.
// Test Data :
// Input the file name to be opened : test.txt
// Expected Output :
// The content of the file test.txt are :
// test line 1
// test line 2
// test line 3
// test line 4
// The number of words in the file test.txt are : 12
// The number of characters in the file test.txt are : 36

#include <stdio.h>
#include <stdlib.h>
int main(){
   FILE * file;
   char path[100];
   char ch, c, s[30];
   int characters, words, lines;

   file = fopen("test.txt", "r");
   if (file == NULL){
      printf("\nUnable to open file.\n");
      exit -1;
   }
   int i=0;
   while ((c = getc(file)) != EOF){ 
		s[i] = c; i++;
	}

	printf("%s\n", s);
   characters = words = lines = 0;
   while ((ch = getc(file)) != EOF){
      characters++;
   if (ch == '\n' || ch == '\0')
      lines++;
   if (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\0')
      words++;
   }
   if (characters > 0){
      words++;
      lines++;
   }
   printf("\n");
   printf("Total characters = %d\n", characters);
   printf("The number of words in the file test.txt are : %d\n", words);
   printf("The number of characters in the file test.txt are : %d\n", lines);
   fclose(file);
   return 0;
}