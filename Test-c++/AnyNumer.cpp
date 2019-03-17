#include<iostream>
using namespace std;
int main(){
		int n,mx=0;
		while(cin >> n){
			if( n > mx )
				mx = n;
		}
		printf("%d",mx);
		return 0;	
}

//求一串数字的最大值OJ题 
