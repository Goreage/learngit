#include<iostream>
#include<cstring>	//�����ַ����⺯��������
using namespace std;
int main()
{
	char title[] = "Prison Break";	//title���һ��Ԫ����'\0'
	char hero[100] = "Micheael Scofield";
	char prisonName[100];
	char response[100];
	cout << "What's the name of the prison in" << title << endl;
	cin >> prisonName;	//�����ַ���
	if(strcmp(prisonName, "Fox-River") == 0)	//�ַ����ȽϺ���,����ھ��Ǽ����������ǲ���Fox-River
		cout << "Yeah! Do you love " << hero << endl;
	else
	{
		//�ַ�����������
		strcpy_s(response, "It seems you havan't watched it!\n");
		cout << response;
	}
}