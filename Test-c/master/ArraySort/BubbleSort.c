#include<stdio.h>

int main()
{
	int a[] = { 1,2,3,4,5,6,7,8,9 };
	int len = sizeof(a) / sizeof(a[0]);

	for (int end = len - 1; end>0; end--)
	{
		//�ڶ���for�ǱȽϵĴ���
		for (int i = 0; i<end; i++)
			if (a[i] > a[i + 1]) {
				int temp;
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
	}
	for (int i = 0; i < len; i++)
		printf("%d\t", a[i]);
	printf("%d\n", len);
	return 0;
}

void bubble_sort(int a[], int n)
{
	//��a�����������������г���С����
	//�������������
	for (i = n - 1, change = true; i > 1 && change; --i)
	{
		change = false;
		for (j = 0; j < i; ++j)
		{
			if (a[j] > a[j + 1]) {
				a[j]<---->a[j + 1]; change = true
			};
			
		}
	}
}