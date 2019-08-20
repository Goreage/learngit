#include<stdio.h>
#include<stdlib.h>

int main()
{
	int n;
	char *month[] = { "January","February","March","April","May",
		"June","July","August","September","October","Novement","December" };
	printf("please input month : Just 5 or 8:\n");
	scanf_s("%d", &n);
	printf("%s\n", *(month + n - 1));
	return 0;
}