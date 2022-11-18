#include <stdio.h>

int main()
{
    int a=12, b=18, c=7, d=4, result;
    result = a + a * - b/c % d + c * d;

    // r = 12 + 12 * - 18 / 7 % 4 + 7 * 4
    // r = 12 - 216 / 7 % 4 + 28
    // r = 12 -30 % 4 + 28
    // r = 12 -2 + 28
    // r = 10 + 28
    // r = 38

    printf("%d\n", result);
    
    return 0;
}
