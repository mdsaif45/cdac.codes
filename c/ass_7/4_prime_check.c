// Write a program to check if a given integer is Prime Number using function.
// Implement function: int checkPrime(int n);

#include <stdio.h>

int checkPrime(int n){
    int c=0;
    for (int i = 2; i <= n; i++)  //4
        if(n%i == 0)
            c++;
    
    if(c == 1)  return 1;
    else        return 0;
}

int main(){
    int num;
    printf("Enter the number : ");
    scanf("%d", &num);

    if(checkPrime(num))
        printf("%d is prime number.\n", num);
    else
        printf("%d is not a prime number.\n", num);

    return 0;
}