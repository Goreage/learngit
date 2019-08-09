#include<stdio.h>

/*
找出key在数组中的位置
@param:  key  要找的数字
@param: a 要寻找的数组
@param: length 数组a的长度
@return: 如果找到，返回其在a中的位置，为找到，返回-1
*/

int search(int key, int a[], int length);
int main()
{
	int a[] = { 2,4,6,7,3,1,5,6,4,8,9,745,45,21,32,12,45 };
	int x;
	int loc;
	printf("请输入一数字:");
	scanf_s("%d", &x);
	loc = search(x, a, sizeof(a) / sizeof(a[0]));
	if (loc != -1) {
		printf("%d在%d个位置上\n", x, loc);
	}
	else {
		printf("%d不存在\n", x);
	}
	return 0;
}
int search(int key, int a[], int length) {
/*
key要找的数字，a要找寻的数组，length数组的长度
searchArray写法：先定义一个判断值默认为为找到用-1表示，遍历数组与key值比较是否相等
如果相等将此时i的值给判断值
*/
	int ret = -1;
	int i;
	for (i = 0; i < length; i++) {
		if (a[i] == key) {
			ret = i;
			break;
		}
	}
	return ret;
}