#include<iostream>
using namespace std;
#define EPS 0.001	//���Կ��Ƽ��㾫��
double Sqrt(double a)
{		//��a��ƽ����
	double x = a / 2, lastX = x + 1 + EPS;	//ȷ���ܹ���������һ�ε���
	while (x - lastX > EPS || lastX - x > EPS)  //Math.abs(x - lastX) > EPS ������ľ���ֵ���ھ��� 
	{
		//ֻҪ����û�дﵽҪ�󣬾ͼ�������
		lastX = x;
		x = (x + a / x) / 2;
	}
	return x;
}
double Distance(double x1, double y1, double x2, double y2)
{	//�����㣨x1,y1��,(x2,y2)�ľ���
	return Sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
}
int main()
{
	int x1, y1, x2, y2, x3, y3;
	cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3;
	cout << Distance(x1, y1, x2, y2) << endl;
	//�����x1,y1������x2,y2���ľ���
	cout << Distance(x1, y1, x3, y3) << endl;
	cout << Distance(x3, y3, x2, y2) << endl;
	return 0;
}
//����������������������ߵı߳�����������
//ţ�ٵ�������ƽ�������ù�ʽ 1/2�� x + a/x ���ĵ������x^2�ĺ������ߵĽ�
