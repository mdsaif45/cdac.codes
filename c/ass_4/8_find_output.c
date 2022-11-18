#include <stdio.h>

int main()
{
    int x = 0;
    
    if(x++)                 //value of x = 0 read then x = 1
        printf("true\n");
    
    else if(x==1)           //value of x = 1 condition true
        printf("false\n");  //print false

    return 0;
}
