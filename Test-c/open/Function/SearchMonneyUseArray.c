#include<stdio.h>
/*
����search�ҳ���λ֮��Ķ�Ӧ��ϵ: 1-penny 5-nickel 10-dime 20-quarter 50-half-dollar
Ԫ�ش���������
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