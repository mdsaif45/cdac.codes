// Write a recursive function to find the sum of n integers.

#include <stdio.h>

int sum(int num){
	static int s =0;
	if(num==0)
		return s;
	else
	{
		s += num; 
		sum(num-1);
	}
}

int main(){
	int num;

	printf("Enter the number : ");
	scanf("%d", &num);

	printf("Sum of integers : %d\n", sum(num));
	return 0;
}