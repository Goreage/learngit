#include<iostream>
using namespace std;
int main(){
	int n;
	cin >> n;
	for(int i=2; i<=n; ++i){	//每次判断i是否是质数 
		int k;
		for( k=2; k<i; ++k){
			if( i % k == 0)
				break;
		}
		if ( k == i)	//k == i说明没有执行过break
				cout << i <<endl; 
	} 
	return 0;
}
//输入正整数n(n>=2),求不大于n的全部质数
//此解法做了没必要的尝试，k大于 i 的平方根后就不会再试
//质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数。 
