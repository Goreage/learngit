#include<iostream>
using namespace std;
int main(){
	int n, mx = 0;
	while(scanf("%d",&n) != EOF){
		//或cin >> n 
		//或 while(scanf("%d",&n) == 1){
		if( n > mx )
				mx = n; 
	}
	printf("%d",mx);
	return 0;
}
//输入若干个（不知道有多少个）正整数，输出其中的最大值
//Sample Input:
// 
