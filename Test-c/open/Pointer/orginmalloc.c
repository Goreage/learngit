#include<stdio.h>
#include<stdlib.h>
/*
在c99没有出来之前就是这样写代码的，先从计算机中借用一段内存用
用完之后在还回去。
*/
int main()
{
	int number;
	int *a;
	int i = 0;
	printf("输入数量：");
	scanf_s("%d", &number);
	//int a[number];
	a = (int*)malloc(number * sizeof(int));
	for (i = 0; i < number; i++) {
		scanf_s("%d", &a[i]);
	}

	for (i = number - 1; i >= 0; i--) {
		printf("%d", a[i]);
	}
	free(a);
	return 0;
}