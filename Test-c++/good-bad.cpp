#include<iostream>
using namespace std;
int main()
{
	int a;
	scanf("%d",&a);
	if( a > 0)
		if( a % 2)
			cout<<"good";
		else 	//这个else到底和那个if配对
			cout<<"bad";
	return 0; 
}//输出-1，输出？
//在一条if语句的某个分支(语句组)里，还可以再写if语句 
//在c++里，else总是和离它最近的if配对 
//花括号总是具有优先级 
