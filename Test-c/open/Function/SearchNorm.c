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
	searchArrayд�����ȶ���һ���ж�ֵĬ��ΪΪ�ҵ���-1��ʾ������������keyֵ�Ƚ��Ƿ����
	�����Ƚ���ʱi��ֵ���ж�ֵ
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