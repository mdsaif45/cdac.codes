// The function func() is used to find…?

#include <stdio.h>

//fuction is use to find middle value between 3 parameteric values
int func(int a, int b, int c){
	if (a>=b && c<b)
		return b;
	else if(a>=b)
		return func(a, c, b);
	else
		return func(b, a, c);
}

int main()
{
	printf("%d\n", func(21, 31, 15)); // middle value is 21
	return 0;
}