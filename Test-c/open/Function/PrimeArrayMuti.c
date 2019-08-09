#include<stdio.h>

int isPrime(int x);

int main()
{
	/*
	@param�ҵ�һ�������������ı����ض�����������Ȼ��ɾѡ����������һ��������
	ʣ�µľ���������
	*/
	const int maxNumber = 25;
	int isPrime[25];
	int i;
	int x;
	for (i = 0; i < maxNumber; i++) {
		isPrime[i] = 1;
	}
	for (x = 2; x < maxNumber; x++) {
		if (isPrime[x]) {
			for (i = 2; i*x < maxNumber; i++) {
				isPrime[i*x] = 0;
			}
		}
	}
	for (i = 2; i < maxNumber; i++) {
		if (isPrime[i]) {
			printf("%d\t", i);
		}
	}
	printf("\n");
	return 0;
}
int isPrime(int x)
{
	/*
	����һ�����������ж��Ƿ���������1��0��ʾ����ʼֵΪ0���ڼ�ɾѡ�����������
	��������ֵ���ж�ֵ���࣬���Ƿ���������
	*/
	int ret = 1;
	int i;
	if (x == 1)ret = 0;
	for (i = 0; i < x; i++) {
		if (x%i == 0) {
			ret = 0;
			break;
		}
	}
	return ret;
}