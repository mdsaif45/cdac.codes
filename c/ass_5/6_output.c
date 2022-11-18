#include <stdio.h>

int main()
{
	int n, x=0, y;
	
	printf("Enter an integer : ");
	scanf("%d", &n);
	
	int temp=n;
	//code to reverse number
	while(n!=0){
		y = n%10;      //gives last digit of n
		x = x*10+y;	   //x storing reverse of input number
		n = n/10;	   //remove on digit from end of n
	}
	
	printf("\nOutput is = %d [reverse of %d]\n", x, temp);

	return 0;
}