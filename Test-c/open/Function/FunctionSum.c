#include<stdio.h>
void sum(int begin, int end) {
	int sum = 0;
	int i;
	for (i=begin; i <= end; i++) {
		sum += i;
	}
	printf("��%d �� %d  �ĺ��� %d\n", begin, end, sum);
}
int main()
{
	sum(10, 20);
	sum(20, 30);
	sum(50, 96);
	return 0;
}