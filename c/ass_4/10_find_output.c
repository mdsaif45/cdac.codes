#include <stdio.h>

int main()
{
    int a= 1, b = -1, c = 0, d;

    d = ++a && ++b || c--;      //after pass a = 2, b = 0, c = -1, d = 0
    // d = 2 && 0 || c--
    // d = 0 || 0
    // d = 0        c=-1
    
    if(d)                       //d=0 false
        printf("Kolkata\n");
    else if(c)                  //c=-1 nonzero true
        printf("Delhi\n");      //print Delhi
    else 
        printf("Bangalore\n");

    printf("a=%d b=%d c=%d d=%d\n", a, b, c, d);

    return 0;
}
