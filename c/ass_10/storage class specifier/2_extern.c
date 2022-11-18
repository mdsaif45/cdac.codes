// Using extern keywords, declare variable in another file(second.c) , and in another
// file(first.c), utlize that variable.


// 2_extern2.c contains
// extern int var = 420;
// var already declared in other file so that gives warning

#include <stdio.h>
extern int var;

int main(){

	printf("\nvar : %d\n", var);

	return 0;
}