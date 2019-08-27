#include<stdio.h>

void f(int i)
{
	printf("in f() %d\n", i);
}
void g(int i)
{
	printf("in g() %d\n", i);
}
void h(int i)
{
	printf("in h() %d\n", i);
}

void k(int i)
{
	printf("in k() %d\n", i);
}

int main(void)
{

	void(*fa[])(int) = { f,g,h,k };

	//scanf_s("%d", &i);
	int i = 2;
	if (i >= 0 && i < sizeof(fa) / sizeof(fa[0])) {
		(*fa[i])(0);
	}

	return 0;
}