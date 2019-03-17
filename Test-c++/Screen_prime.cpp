#include<iostream>	//筛选求素数 
using namespace std;
#define MAX_NUM 10000000
char isPrime[MAX_NUM + 10];		//最终如果isPrime[i]为1，则表示i是素数
int main(){
	for ( int i=2; i<=MAX_NUM; ++i)		//开始假设所有数都是素数
			isPrime[i] = 1;
	for ( int i=2; i<=MAX_NUM; ++i){	//开始假设所有数都是素数 
			if ( isPrime[i])		//只标记素数的倍数
					for( int j=2*i; j<=MAX_NUM; j+=i)
							isPrime[j] = 0;		//将素数i的倍数标记为非素数 
	}
	for ( int i=2; i<=MAX_NUM; ++i)
				if( isPrime[i] )
					cout << i <<endl;
	return 0;
} 
