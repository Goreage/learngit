#include<iostream> 
using namespace std;
int main(){
	for( int i=1; i<=10; ++i){
		if( i % 2)
		continue;	//导致不执行后面的语句，回到循环开头
		cout << i <<"," ;
	} 
	return 0;
}
