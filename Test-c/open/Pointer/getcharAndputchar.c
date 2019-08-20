#include<stdio.h>
/*
use getchar and puchar  when I enter enter , the massage input shell,and ouput
scanf_s 与 putchar 之间的区别
Ctrol  + c   Ctrol +D表示程序的终止
*/
int main(int agrc, char const *argv[])
{
	int ch;
	while ((ch = getchar()) != EOF) {
		putchar(ch);
	}
	printf("EOF\n");

	return 0;
}