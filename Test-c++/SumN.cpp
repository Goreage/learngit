#include<iostream>
using namespace std;
int main(){
		int n;
		cin >> n;
		int sum = 0;
		for(int i=1; i<=n; ++i){
			int factorial=1;	//���i�׳�
			for (int j=1; j<=i; ++j)
					factorial *= j;		//�˲�����1+2+3+..n��
		 	sum += factorial;
		}
		cout << sum;
		return 0;
}
