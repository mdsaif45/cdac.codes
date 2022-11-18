#include <stdio.h>

float func(float age[]);

int main()
{
	float result, age[]={23.4, 55, 22.6, 3, 40.5, 18};
	result = func(age);				//calling func function assign return value to result
	
	printf("%0.2f\n", result);		//print result avg of age = 27.08

	return 0;
}

float func(float age[]){
	int i;
	float result, sum=0.0;
	
	for (int i = 0; i < 6; ++i){
		sum += age[i];				//count sum of age
	}
	result = (sum/6);				//result = avg of age

	return result;
}