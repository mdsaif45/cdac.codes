#include <stdio.h>

int main(int argc, char const *argv[])
{
    int s = ~3;
    int a=1,b=0,z=5;
    a = a && b || z++;
    int x=16;
    a = x>>3;
    printf("Hello baby...\n%d\n\n", a);

    
    return 0;
}
