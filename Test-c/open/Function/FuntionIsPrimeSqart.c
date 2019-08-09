 #include<stdio.h>
/*
求m到n的素数的和，将判断是否是素数变为一个函数
分离出来的函数可以看成一个判断素数的模块，可适用于其他程序

*/
int isPrime(int x) {
	/*
	定义一个变量用于判断是否是素数用1和0表示，初始值为0，在加删选条件，后遍历
	最开始的方法从2开始删选是否是素数，查找量大
	*/
	int ret = 1;
	int i;
	if (x == 1)ret = 0;
	for (i = 2; i < x; i++) {
		if (x%i == 0) {
			ret = 0;
			break;
		}
	}
	return ret;
}
int isPrimeAdd(int x) {
/*
去掉偶数后，从3到x-1 每次加 2，筛选素数，
*/
		int ret= 1;
		int i;
		if (x == 1 || (x % 2 == 0 && x != 2))
			ret = 0;
		for (i = 3; i < x; i += 2) {
			if (x%i == 0) {
				ret = 0;
				break;
			}				
		}
		return ret;
}
int isPrimeSqrt(int x) {
	/*
	去掉偶数后，从3到x-1 每次加 2，筛选素数，
	*/
	int ret = 1;
	int i;
	if (x == 1 || (x % 2 == 0 && x != 2))
		ret = 0;
	for (i = 3; i < sqrt(x); i += 2) {
		if (x%i == 0) {
			ret = 0;
			break;
		}
	}
	return ret;
}
int main()
{
	int m, n;
	int sum = 0;
	int cnt = 0;
	int i;
	scanf_s("%d %d", &m, &n);
	//m=10, n=31
	if (m == 1) m = 2;
	for (i = m; i <= n; i++) {
		if (isPrimeSqrt(i)) {
			sum += i;
			cnt++;
		}
	}
	printf("%d %d\n", cnt, sum);
	return 0;
}