#include<stdio.h>

int max(int a, int b) {
	int ret;
	if (a > b) {
		ret = a;
	}
	else {
		ret = b;
	}
	return ret;
}
int main() {
	int c;
	c=max(5, 89);
	printf("%d\n",c);
	return 0;
}