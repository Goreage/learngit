#include<stdio.h>

int search(int key, int a[], int length);

int main()
{
	int a[] = { 1,2,3,4,5,6,78,9,56,21,45,65,21 };
	int r = search(21, a, sizeof(a) / sizeof(a[0]));
	printf("%d\n", r);
	return 0;
}

int search(int key, int a[], int length) {
	/*
	searchArray写法：先定义一个判断值默认为为找到用-1表示，遍历数组与key值比较是否相等
	如果相等将此时i的值给判断值
	*/
	int ret = -1;
	for (int i = 0; i < length; i++) {
		if (key == a[i]) {
			ret = i;
			break;
		}
	}
	return ret;
}