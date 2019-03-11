#include<iostream>
using namespace std;
int main(){
		int n;
		cin >> n;
		int sum = 0;
		for(int i=1; i<=n; ++i){
			int factorial=1;	//存放i阶乘
			for (int j=1; j<=i; ++j)
					factorial *= j;		//此操作做1+2+3+..n次
		 	sum += factorial;
		}
		cout << sum;
		return 0;
}
