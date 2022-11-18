#include <stdio.h>

double power(double x, int n){
	int p=1;
	while(n--){
		p *= x;
	}
	return p;
}

int main(int argc, char const *argv[])
{
	printf("pow 4, 2 : %lf", power(2.618033988749895, 20));
	return 0;
}





















// abhibhat@abhibhat-VirtualBox:~/Projects/GIPL6_2$ ls -1 Test_*|xargs -I{} sh -c "echo {} && echo "-----------------" && cat {}"
// Test_withlibm.c
// -----------------
// #include<stdio.h>
// #include<math.h>
// int main() {
//     int i=20;
//     double output1=pow(2.618033988749895,i);
//     return 0;
//     }
// Test_withoutlibm.c
// -----------------
// #include<stdio.h>
// #include<math.h>
// double Pow(double _X, int _Y)  {
//     double _Z = 1;
//     for (; _Y; _X *= _X) {
//     if (_Y & 1) _Z *= _X;
//     _Y >>= 1;
//     }
//     return _Z; 
//     }
// int main() {
//     int i=20;
//     double output1=Pow(2.618033988749895,i);
//     return 0;
//     }
// abhibhat@abhibhat-VirtualBox:~/Projects/GIPL6_2$ gcc Test_withlibm.c -lm -o Main_withlibm.o
// abhibhat@abhibhat-VirtualBox:~/Projects/GIPL6_2$ gcc Test_withoutlibm.c -o Main_withoutlibm.o
// abhibhat@abhibhat-VirtualBox:~/Projects/GIPL6_2$ objdump -d Main_withoutlibm.o|wc -l
// 261
// abhibhat@abhibhat-VirtualBox:~/Projects/GIPL6_2$ objdump -d Main_withlibm.o|wc -l
// 241