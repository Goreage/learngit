#include<iostream>
using namespace std;
int main()
{
	int n1 = 1378; 	//1378的十六进制形式是0x532 
	short n2;
	char c = 'a';
	double d1 = 7.809;
	double d2;
	n2 = c+1;	//n2变为98，,97是'a'的ASSCII码
	printf("c=%c,n2=%d\n",c,n2);	//输出 c=b, n2=98
	c = n1;		//n1是0x562，0x62当作ASSCII码赋值给c，c变为'b'
	printf("c=%c,n1=%d\n",c,n1);	//输出 c=b,n1=1378
	n1 = d1;	//d1=7.809,去掉小数部分后赋值给n1，n1变为7
	printf("n1=%d\n",n1);	//输出 n1=7
	d2 = n1;	//d2变为7
	printf("d2=%f\n",d2);	//输出 d2=7.000000		 
}
