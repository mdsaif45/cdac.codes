#include <stdio.h>

int main()
{
    int y=10;
    int z = y+(y==10);

    // z = 10 + ( 10 == 10)
    // z = 10 + (true)         true=1
    // z = 10 + 1
    // z = 11

    printf("%d\n", z);
    
    return 0;
}

