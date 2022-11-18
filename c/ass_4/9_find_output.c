#include <stdio.h>

int main()
{
    int a = 1, b = 2, c = 3;

    if (c>b>a)                  //c>b = true(1) => 1>a = false(0)
        printf("true\n");
    else 
        printf("false\n");      //print fasle

    return 0;
}