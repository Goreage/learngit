#include<stdio.h>//逢三过（100-200中不能被3整除的数） 
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
