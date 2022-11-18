// Define a structure type struct personal that would contain person name, date of joining and
// salary using this structure to read this information of 5 people and print the same on screen.

#include <stdio.h>

struct personal{
	char name[20];
	char date_of_joining[20];
	int salary;
};

int main(){
	struct personal person[5];
	

	for (int i = 0; i < 5; ++i){

		printf("\nEnter person name %d   : ", i+1);
		scanf(" %[^\n]s", person[i].name);

		printf("Enter date of joining : ");
		scanf(" %[^\n]s", person[i].date_of_joining);

		printf("Enter person's salary : ");
		scanf(" %d", &person[i].salary);

	}
	printf("\n-------Details-------\n");
	for (int i = 0; i < 5; ++i){

		printf("\nPerson name     : %s\n", person[i].name);
		printf("Date of joining : %s\n", person[i].date_of_joining);
		printf("Person's salary : %d\n", person[i].salary);
	}


	return 0;
}