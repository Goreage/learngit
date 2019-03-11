#include<iostream>
using namespace std;
#define NUM 100		//使用符号常量，便于修改
int a[NUM];			//数组一般不要定义在main里面，尤其是大数组
int main(){
	for ( int i=0; i<NUM; ++i)
			cin >> a[i];
	for ( int i=NUM-1; i>=0; --i)
			cout << a[i] << " ";
	return 0;
} 
//接受键盘输入的100个整数，然后将它们按原顺序相反的顺序输出 
