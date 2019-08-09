#include<stdio.h>
/*
利用search找出单位之间的对应关系: 1-penny 5-nickel 10-dime 20-quarter 50-half-dollar
元素存在数组中
*/
int amount[] = { 1,5,10,15,20,50 };
char *name[] = { "penny","nickel","dime","quarter","half-dollar" };
int search(int key, int a[], int length);

int main()
{
	int k = 10;
	int r = search(10, amount, sizeof(amount) / sizeof(amount[0]));
	if (r > -1) {
		printf("%s\n", name[r]);
	}
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