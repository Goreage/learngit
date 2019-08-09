 #include<stdio.h>
/*
��m��n�������ĺͣ����ж��Ƿ���������Ϊһ������
��������ĺ������Կ���һ���ж�������ģ�飬����������������

*/
int isPrime(int x) {
	/*
	����һ�����������ж��Ƿ���������1��0��ʾ����ʼֵΪ0���ڼ�ɾѡ�����������
	�ʼ�ķ�����2��ʼɾѡ�Ƿ�����������������
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
ȥ��ż���󣬴�3��x-1 ÿ�μ� 2��ɸѡ������
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
	ȥ��ż���󣬴�3��x-1 ÿ�μ� 2��ɸѡ������
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