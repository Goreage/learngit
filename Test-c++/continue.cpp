#include<iostream> 
using namespace std;
int main(){
	for( int i=1; i<=10; ++i){
		if( i % 2)
		continue;	//���²�ִ�к������䣬�ص�ѭ����ͷ
		cout << i <<"," ;
	} 
	return 0;
}
