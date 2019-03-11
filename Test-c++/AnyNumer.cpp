#include<iostream>
using namespace std;
int main(){
		int n,mx;
		cin >> mx;
		while(cin >> n){
			if( n > mx )
				mx = n;
		}
		cout<<mx<<endl;
		return 0;	
}
