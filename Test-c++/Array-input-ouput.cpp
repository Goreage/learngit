#include<iostream>
using namespace std;
#define NUM 100		//ʹ�÷��ų����������޸�
int a[NUM];			//����һ�㲻Ҫ������main���棬�����Ǵ�����
int main(){
	for ( int i=0; i<NUM; ++i)
			cin >> a[i];
	for ( int i=NUM-1; i>=0; --i)
			cout << a[i] << " ";
	return 0;
} 
//���ܼ��������100��������Ȼ�����ǰ�ԭ˳���෴��˳����� 
