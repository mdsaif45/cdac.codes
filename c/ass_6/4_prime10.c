// Write a program in C to find all prime numbers from 1 to n

#include <stdio.h>

int checkPrime(int n){
    int c=0;
    for (int i = 2; i <= n; i++)  
        if(n%i == 0)
            c++;
    
    if(c == 1)  return 1;
    else        return 0;
    
}
int main()
{
	int num, c=0;

	printf("Enter the number : ");
	scanf("%d", &num);

	for(int i=1; i<=num; i++){

		if(checkPrime(i))
			printf("%d ", i);	
	}
	printf("\n");
	return 0;
}