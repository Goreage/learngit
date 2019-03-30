#include<iostream>
using namespace std;
int main()
{
	char test[]= "Please input your name:\n";
	char *p = test;
	cout << p;		//Èô²»ÓÃcout,printf(p)Òà¿É
	char name[20];
	char * pName = name;
	cin >> pName;
	cout << "Your name is" << pName;
	system("pause");
	return 0;
}