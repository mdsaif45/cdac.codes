#include <stdio.h>

int main(int argc, char const *argv[])
{
    int h = 9;

    int b = 5 * 2 + 2 * 3 < h*2 ? 5:3;
    // b = 16 < 19 ? 5 : 3              condition is true, so returns 5 
    // b = 5

    printf("%d\n", b);

    return 0;
}
