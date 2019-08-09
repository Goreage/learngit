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
	����������������ֳ�left �� rigth, mid���Ƚ�mid��Ҫ�Ƚ����Ĵ�С��
	�����mid��left = mid+1; �����midС�� right = mid -1;
	��left > right ��˵��û�����������
	���Ӷȣ�log2n�� 100��7�� 1000��10�� Ч�ʺܸ�
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