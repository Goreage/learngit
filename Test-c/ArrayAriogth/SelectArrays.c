#include<stdio.h>

int max(int a[], int len);

int main()
{
	int a[] = { 21,56,3,54,98,2,3,6,5,4,8,9,95,654,85 };
	int len = sizeof(a) / sizeof(a[0]);
	//选择排序
	/*
	选出一个数组的最大值，将这个数组的最大值与数组最后的值Arrays[len-1]的值交换，
	循环len-1次，使用 for(int i=len-1; i>0; i--)倒着排序
	*/
	for (int i = len - 1; i>0; i--)
	{
		int maxid = max(a, i + 1);
		//swap maxid 与 len-1交换	
		int t = a[maxid];
		a[maxid] = a[i];
		a[i] = t;
	}
	for (int i = 0; i < len; i++) {
		printf("%d ", a[i]);
	}
	return 0;
}

int max(int a[], int len)
{
	int maxid = 0;
	for (int i = 0; i < len; i++) {
		if (a[i] > a[maxid]) {
			maxid = i;
		}
	}
	return maxid;
}