#include<stdio.h>//��������100-200�в��ܱ�3���������� 
int main()
{
	int n;
	for(n=1;n<=200;n++)
	{
		if(n%3==0)
		continue;
		printf("%d\t",n);
	}
	printf("\n");
	return 0;
}
