#include<stdio.h>
/*
����search�ҳ���λ֮��Ķ�Ӧ��ϵ: 1-penny 5-nickel 10-dime 20-quarter 50-half-dollar
Ԫ�ش��ڽṹ����
*/
struct {
	int amount;
	char *name;
}coins[] = {
	{ 1,"pennny" },
{ 5,"nickel" },
{ 10,"dime" },
{ 20,"quarter" },
{ 50,"half-dollar" }
};
int search(int key, int a[], int length);

int main()
{
	int k = 10;
	for (int i = 0; i < sizeof(coins) / sizeof(coins[0]); i++) {
		if (k == coins[i].amount) {
			printf("%s\n", coins[i].name);
			break;
		}
	}
	return 0;
}