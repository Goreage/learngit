#include<iostream>	//ɸѡ������ 
using namespace std;
#define MAX_NUM 10000000
char isPrime[MAX_NUM + 10];		//�������isPrime[i]Ϊ1�����ʾi������
int main(){
	for ( int i=2; i<=MAX_NUM; ++i)		//��ʼ������������������
			isPrime[i] = 1;
	for ( int i=2; i<=MAX_NUM; ++i){	//��ʼ������������������ 
			if ( isPrime[i])		//ֻ��������ı���
					for( int j=2*i; j<=MAX_NUM; j+=i)
							isPrime[j] = 0;		//������i�ı������Ϊ������ 
	}
	for ( int i=2; i<=MAX_NUM; ++i)
				if( isPrime[i] )
					cout << i <<endl;
	return 0;
} 
