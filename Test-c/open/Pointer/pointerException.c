#include <stdio.h>
/*
@return：如果除法成功，返回1 否则返回0
*/

int divide(int a, int b, int *result);
int main()
{
	int a = 5;
	int b = 2;
	int c;
	if (divide(a, b, &c)) {
		printf("%d/%d=%d\n", a, b, c);
	}
	return 0;
}
int divide(int a, int b, int *result)
{
	/*
	@param：运用指针是因为能将结果传到main中，不管有无循环，有可能b=0会产生
	异常，c语言中只能这样做，Java中可以用try-catch来做
	*/
	int ret = 1;
	if (b == 0)ret = 0;
	else {
		*result = a / b;
	}
	return ret;
}