#include<iostream>
#include<cstring>	//包含字符串库函数的声明
using namespace std;
int main()
{
	char title[] = "Prison Break";	//title最后一个元素是'\0'
	char hero[100] = "Micheael Scofield";
	char prisonName[100];
	char response[100];
	cout << "What's the name of the prison in" << title << endl;
	cin >> prisonName;	//输入字符串
	if(strcmp(prisonName, "Fox-River") == 0)	//字符串比较函数,后等于就是监狱的名字是不是Fox-River
		cout << "Yeah! Do you love " << hero << endl;
	else
	{
		//字符串拷贝函数
		strcpy_s(response, "It seems you havan't watched it!\n");
		cout << response;
	}
}