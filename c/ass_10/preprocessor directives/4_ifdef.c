// Give example usage of conditional compilation using #ifdef, #ifndef and #undef.1
#include <stdio.h>
#define VAR 
#define VAR1 3

int main()
{
   //return true if this macro is defined
   #ifdef VAR
	printf("var is defined\n");
   #else
   	printf("var is not defined\n");
   #endif

   //undefines a preprocessor macro
   #undef VAR
    
   #ifdef VAR
	printf("var is defined\n");
   #else
	printf("var is undefined\n");
   #endif
	
   //return true if this macro is not defined  
   #ifndef VAR1
	printf("var1 is not defined\n");
   #else
   	printf("var1 is defined\n");
   #endif

   return 0;
}
