// Write a simple structure called student containing fields (int id, char gender and char name[size]; Create a variable of this structure(ex: std1), fill in the fields of this structure variable
// and use a pointer to std1 which changes the member values for std1.

#include <stdio.h>

struct std{
	int id;
	char gender;
	char name[20];
};

int main(){
	struct std std1;

	printf("Enter the student ID : ");
	scanf("%d", &std1.id);

	printf("Enter student gender : ");
	scanf(" %c", &std1.gender);

	printf("Enter student name   : ");
	scanf(" %[^\n]s", std1.name);

	printf("\nStudent ID     : %d\n", std1.id);
	printf("Student gender : %c\n", std1.gender);
	printf("Student name   : %s\n", std1.name);

	return 0;
}