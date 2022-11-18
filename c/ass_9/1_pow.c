// Write a C program to calculate power a given number using pow(a,b) function in math.h with evaluates: a^b
// Use #include<math.h> in your c program.

#include <stdio.h>
#include <math.h>

// int power(int number, int pow){
//     if(pow == 1) 
// 		return number;
// 	else 
// 		return number * power(number, pow-1);
// }

int main()
{
	double num, pw;

	printf("Enter the number : ");
	scanf("%lf%lf", &num, &pw);

	printf("%.2lf\n", pow(num, pw));
	return 0;
}