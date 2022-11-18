#include <stdio.h>

int i;			//i=0
int fun();

int main()
{
	while(i){	//0=false i.e while never start
		//never get call
		fun();
		main();
	}
	printf("Hello\n");	//print only Hello

	return 0;
}

int fun(){
	printf("Hi");
}