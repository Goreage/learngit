#include<stdio.h>

/*
�ҳ�key�������е�λ��
@param:  key  Ҫ�ҵ�����
@param: a ҪѰ�ҵ�����
@param: length ����a�ĳ���
@return: ����ҵ�����������a�е�λ�ã�Ϊ�ҵ�������-1
*/

int search(int key, int a[], int length);
int main()
{
	int a[] = { 2,4,6,7,3,1,5,6,4,8,9,745,45,21,32,12,45 };
	int x;
	int loc;
	printf("������һ����:");
	scanf_s("%d", &x);
	loc = search(x, a, sizeof(a) / sizeof(a[0]));
	if (loc != -1) {
		printf("%d��%d��λ����\n", x, loc);
	}
	else {
		printf("%d������\n", x);
	}
	return 0;
}
int search(int key, int a[], int length) {
/*
keyҪ�ҵ����֣�aҪ��Ѱ�����飬length����ĳ���
searchArrayд�����ȶ���һ���ж�ֵĬ��ΪΪ�ҵ���-1��ʾ������������keyֵ�Ƚ��Ƿ����
�����Ƚ���ʱi��ֵ���ж�ֵ
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