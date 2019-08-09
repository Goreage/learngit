#include<stdio.h>

int isPrime(int x);

int main()
{
	/*
	@param找到一个素数，那他的倍数必定不是素数，然后删选，继续找下一个素数。
	剩下的就是素数了
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
	定义一个变量用于判断是否是素数用1和0表示，初始值为0，在加删选条件，后遍历
	用增减的值与判断值求余，看是否是素数。
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