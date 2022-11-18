//Implement average function of two numbers as below:
// double average(double, double);

#include <stdio.h>

double average(double num1, double num2){
    return (num1+num2)/2;
}

int main(){
    double num1, num2;

    printf("Enter two numbers : ");
    scanf("%lf%lf", &num1, &num2);

    printf("\nAverage(%.1lf, %.1lf) : %.2lf\n", num1, num2, average(num1, num2));

    return 0;
}