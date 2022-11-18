// Can two functions have variables with the same name? 
// Give example of they both have different scopes.

// Yes, two or more fucntion can have variable with the same name.
// because that same name varible always to local to it specific function.
// which means that var inside func does exist or scope outside the func.
#include <stdio.h>

int fun1(){
	// variable var local to fun1
	int var = 4; 
	printf("fun1 -> var = %d\n", var);
	return 0;
}

int fun2(){
	// variable var local to fun2
	int var = 9;
	printf("fun2 -> var = %d\n", var);
	return 0;
}

int main(){

	fun1();
	fun2();
	return 0;
}