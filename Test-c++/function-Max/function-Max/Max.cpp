#include<iostream>
using namespace std;
int Max(int x, int y)	//���������ͱ����еĽϴ�ֵ///�β�
{
	if (x > y)
		return x;
	return y;
}
int main()
{
	int n = Max(4, 6);	//ʵ��
	cout << n << "," << Max(20, n) << endl;
	return 0;
}