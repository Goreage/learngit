#include<stdio.h>
#include<stdlib.h>
/*
��c99û�г���֮ǰ��������д����ģ��ȴӼ�����н���һ���ڴ���
����֮���ڻ���ȥ��
*/
int main()
{
	int number;
	int *a;
	int i = 0;
	printf("����������");
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