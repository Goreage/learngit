#include<iostream>
#include<string>	//ʹ��string�������"ͷ�ļ�"
using namespace std;
string weekdays[] = {	//string���ַ������͡��ɴ���ַ������� 
		"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
					};	//�ַ�������
 int main(){
 	int n;
 	cin >> n;
 	if ( n>7 || n<1)
 			cout << "Illegal";
 	else
 			cout << weekdays[n-1];
 	return 0;
 }
