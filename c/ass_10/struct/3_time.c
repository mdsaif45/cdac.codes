// Define structure data type called time_struct containing three member’s integer hour, integer
// minute and integer second. Develop a program that would assign values to the individual
// number and display the time in the following format: 16: 40:51

#include <stdio.h>

struct time_struct{
	int hour, minute, second;
};

int main(){
	struct time_struct time;

	printf("Enter Hours  : ");
	scanf("%d", &time.hour);
	printf("Enter minute : ");
	scanf("%d", &time.minute);
	printf("Enter second : ");
	scanf("%d", &time.second);

	printf("\n Time : %d:%d:%d\n", time.hour, time.minute, time.second);
	return 0;
}