#include<iostream>
#include<cmath>	//ͷ�ļ�<cmath>�а��������ѧ�⺯��������
using namespace std;
int main()
{
	double a;
	cin >> a;
	if (a < 0) {
		cout << "Illegal input" << endl;
		return 0;
	}
	cout << sqrt(a);	//���ñ�׼�⺯����ƽ����
	return 0;
}
//��һ������ƽ����