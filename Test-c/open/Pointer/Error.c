#include<stdio.h>
#include<stdlib.h>
/*
此程序勿用，会导致电脑死机  skr 
*/
int main()
{
	void *p;
	int cnt = 0;
	while ((p = malloc(100 * 1024 * 1024))) {
		cnt++;
	}
	printf("分配了%d00MB的空间\n", cnt);


	return 0;
}