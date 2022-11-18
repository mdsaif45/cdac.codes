// Write a program and implement a function to find if it is leap year or not. 
// int is_leap_year(int year);
// • is_leap_year() returns 1 if leap year
// • is_leap_year() returns 0 if NOT leap year
// Take 4 digit year as input for example: 2000

#include <stdio.h>

int is_leap_year(int year){
    if(year%400==0 || year%100 != 0 && year%4==0)
        return 1;
    else 
        return 0;
}
int main(){
    int year;

    printf("Enter the year : ");
    scanf("%d", &year);

    if(is_leap_year(year))
        printf("\n%d is a leap year \n", year);
    else
        printf("\n%d is not a leap year \n", year);
    return 0;
}