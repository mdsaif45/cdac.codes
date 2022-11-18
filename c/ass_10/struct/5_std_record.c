// Design a structure student_record to contain name, branch and total marks obtained.
// Develop a program to read data for 10 students in a class and print them.

#include <stdio.h>

struct student_record{
	char std_name[20];
	char std_branch[20];
	float std_marks;
};

int main(){
	struct student_record students_data[10];

	for (int i = 0; i < 3; ++i)
	{
		printf("\nEnter student name   : ");
		scanf(" %[^\n]s", students_data[i].std_name);
		printf("Enter branch name    : ");
		scanf(" %[^\n]s", students_data[i].std_branch);
		printf("Enter studnet marks  : ");
		scanf("%f", &students_data[i].std_marks);
	}
	printf("\n-------Details-------\n");
	for (int i = 0; i < 3; ++i)
	{
		printf("\nStudent name   : %s\n", students_data[i].std_name);
		printf("Branch name    : %s\n", students_data[i].std_branch);
		printf("Studnet marks  : %.2f\n", students_data[i].std_marks);
		
	}

	return 0;
}