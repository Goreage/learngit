#include<stdio.h>

/*
x86的cpu 小端输出， 低位在前
将1234送人chi 中 以 十六进制输出  1234 -》 00 00 04 D4
*/
typedef union {
	int i;
	char ch[sizeof(int)];
}CHI;

int main(int argc, char const *argv[])
{
	CHI chi;
	int i;
	chi.i = 1234;
	for (i = 0; i < sizeof(int); i++)
	{
		printf("%02hhX", chi.ch[i]);
	}
	printf("\n");
	return 0;
}