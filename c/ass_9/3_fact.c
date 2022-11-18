// Write a program and implement a factorial function using below 
// prototype declarations: long int factorial(long int);

#include <stdio.h>
long int factorial(long int);

int main(){
    long int num;

    printf("Enter the number : ");
    scanf("%ld", &num);

    printf("factorial(%ld) : %ld\n", num, factorial(num));
    return 0;
}

long int factorial(long int num){
    if(num==1)
        return 1;
    else
        return num * factorial(num-1);
}