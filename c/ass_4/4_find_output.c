#include <stdio.h>

int main()
{
    int i;
 
    /* 
    if( a, b ,c) // in this case condition value taken from c i.e vaue of c take for check condition is true or false check with
    (4,5,0)-> false output = CDAC                          
    (9,23,1)-> true  output = C programming
    also (2,3,6)-> true output = C programming
    */

    if(i=5,0,1)              // 5 will assing to var i and cond is true bcoz of 1       
        printf("CDAC ");      
    else    
        printf("C Programming ");

    printf("%d\n", i);       // output 5    

    
    return 0;
}

