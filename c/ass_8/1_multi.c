// Write a program to implement multiplication using addition. Use recursion.

#include <stdio.h>

int multi(int a, int b){  //3 2
	static int sum = 0;

	if(b == 0) 
		return sum;
	else{ 
		sum += a; 
		multi(a, b-1);
	}
}

int main(){
	int num1, num2;

	printf("Enter the number : ");
	scanf("%d%d", &num1, &num2);

	printf("%d * %d = %d\n", num1, num2, multi(num1, num2));

	return 0;
}