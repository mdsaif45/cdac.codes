// Using Static keyword, keep a count of the number of times a function was called.

#include <stdio.h>

//global static variable of int type
static int count=0;

//function return count of its called
int fun(){
	return ++count;
}

int main(){

	//calling fun function 3 times
	fun();
	fun();
	fun();

	printf("\n%d\n", count);
	return 0;
}