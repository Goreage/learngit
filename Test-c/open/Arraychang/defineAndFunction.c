#include<stdio.h>

#define cube(x) ((x)*(x)*(x))

int main(int argc, char const *argv[])
{
	int i;
	scanf_s("%d", &i);
	printf("%s\n", cube(5));
	return 0;
}