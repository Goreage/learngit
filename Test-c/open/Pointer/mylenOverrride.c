#include<stdio.h>
#include<string.h>
/*
size_t:typedef unsigned long long size 定义了数据类型
重写strlen 字符串操作
*/
size_t mylen(const char *s)
{
	int idx = 0;
	while (s[idx] != '\0')
	{
		idx++;
	}
	return idx;
}

int main(int argc, char const *argv[])
{
	char line[] = "Hello";
	//%lu32位无符号整数
	printf("strlen=%lu\n", mylen(line));
	printf("sizeof=%lu\n", sizeof(line));
	return 0;
}