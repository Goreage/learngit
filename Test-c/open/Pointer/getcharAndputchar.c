#include<stdio.h>
/*
use getchar and puchar  when I enter enter , the massage input shell,and ouput
scanf_s �� putchar ֮�������
Ctrol  + c   Ctrol +D��ʾ�������ֹ
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