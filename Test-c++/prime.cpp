#include<iostream>
using namespace std;
int main(){
	int n;
	cin >> n;
	for(int i=2; i<=n; ++i){	//ÿ���ж�i�Ƿ������� 
		int k;
		for( k=2; k<i; ++k){
			if( i % k == 0)
				break;
		}
		if ( k == i)	//k == i˵��û��ִ�й�break
				cout << i <<endl; 
	} 
	return 0;
}
//����������n(n>=2),�󲻴���n��ȫ������
//�˽ⷨ����û��Ҫ�ĳ��ԣ�k���� i ��ƽ������Ͳ�������
//��������Ϊ�ڴ���1����Ȼ���У�����1�����������ⲻ�������������� 
