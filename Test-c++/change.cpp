#include<iostream>
using namespace std;
int main()
{
	int n1 = 1378; 	//1378��ʮ��������ʽ��0x532 
	short n2;
	char c = 'a';
	double d1 = 7.809;
	double d2;
	n2 = c+1;	//n2��Ϊ98��,97��'a'��ASSCII��
	printf("c=%c,n2=%d\n",c,n2);	//��� c=b, n2=98
	c = n1;		//n1��0x562��0x62����ASSCII�븳ֵ��c��c��Ϊ'b'
	printf("c=%c,n1=%d\n",c,n1);	//��� c=b,n1=1378
	n1 = d1;	//d1=7.809,ȥ��С�����ֺ�ֵ��n1��n1��Ϊ7
	printf("n1=%d\n",n1);	//��� n1=7
	d2 = n1;	//d2��Ϊ7
	printf("d2=%f\n",d2);	//��� d2=7.000000		 
}
