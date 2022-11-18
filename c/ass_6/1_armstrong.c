// Write a Program to find if a given number is Armstrong number.
// Armstrong number has property:
// 153 = 1^3 + 5^3 + 3^3

#include <stdio.h>
#include <math.h>

int main(){
	int num;
	
	printf("Enter the number : ");
	scanf("%d", &num);

	int temp = num, arm=0, p=0;

	//count number of digits in input number
	while(num){
		p++; num/=10;
	}
	//caculate armstrong number from input number
	num = temp;
	while(num){
		arm += pow(num%10, p);
		num/=10; 
	}
	
	//print to tell number is armstrong or not
	if(temp == arm)
		printf("%d is an armstrong number.\n", temp);
	else
		printf("%d is not an armstrong number.\n", temp);
	return 0;
}