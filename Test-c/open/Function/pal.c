#include <stdio.h>

void PrintN(int N);

int main()
{
	int N;

	scanf_s("%d", &N);
	PrintN(N);

	return 0;
}
void PrintN(int N)
{
	int i;
	for (i = 1; i <= N; i++)
	{
		printf("%d\n", i);
	}
}
