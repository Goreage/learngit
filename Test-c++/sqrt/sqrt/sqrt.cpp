#include<iostream>
#include<cmath>	//头文件<cmath>中包含许多数学库函数的声明
using namespace std;
int main()
{
	double a;
	cin >> a;
	if (a < 0) {
		cout << "Illegal input" << endl;
		return 0;
	}
	cout << sqrt(a);	//调用标准库函数求平方根
	return 0;
}
//求一个数的平方根