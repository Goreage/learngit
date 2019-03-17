#include<iostream>
using namespace std;
int Max(int x, int y)	//求两个整型变量中的较大值///形参
{
	if (x > y)
		return x;
	return y;
}
int main()
{
	int n = Max(4, 6);	//实参
	cout << n << "," << Max(20, n) << endl;
	return 0;
}