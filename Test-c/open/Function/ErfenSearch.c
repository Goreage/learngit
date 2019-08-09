#include<stdio.h>
int search(int key, int a[], int len);
int main()
{
	int a[] = { 1,2,3,4,5,6,7,8,9,10,12,15,18,56,89,655 };
	int r = search(15, a, sizeof(a) / sizeof(a[0]));
	printf("%d\n", r);
	return 0;
}
int search(int key, int a[], int len) {
	/*
	二分搜索：将数组分成left 和 rigth, mid，比较mid与要比较数的大小，
	如果比mid大，left = mid+1; 如果比mid小， right = mid -1;
	当left > right 是说明没他妈这个数。
	复杂度：log2n次 100搜7次 1000搜10次 效率很高
	*/
	int ret = -1;
	int left = 0;
	int right = len - 1;
	while (right>left)
	{
		int mid = (left + right) / 2;
		if (a[mid] == key)
		{
			ret = mid;
			break;
		}
		else if (a[mid] > key)
		{
			right = mid - 1;
		}
		else {
			left = mid + 1;
		}
	}
	return ret;
}