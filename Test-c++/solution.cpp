#include<iostream>
using namespace std;
int main(){
	int n,m;
	cin>>n>>m;
	int a = m + 1,b = m + 1;//a,b记录已经找到的最佳兄弟数，a是弟数，b是兄数
	for ( int i = n; i<m; ++i){	//取弟数，共用m-n种取法 
		if ( i>(a+b)/2 + 1)
			break;	//外重循环
		for ( int j=i+1; j<=m; ++j){	//取兄数 
			if( i+j >a+b ) break;	//跳出内重循环
			if( i*j % (i+j) == 0){	//发现兄弟数 
				if( i+j < a+b){	//发现和更小的兄弟数 
					a = i;	b = j;	//更新已找到的最佳兄弟数 
				}
				else if( i+j == a+b && i<a)
								//发现和相同但弟数更小的兄弟数
					a = i; b = j;	//更新已找到的最佳兄弟数 
			} 
		} 
	} 
	if ( a == m+1 )	//没有找到兄弟数
		cout << "No solution.";
	else
		cout<<a<<","<<b;	//适当的使用break语句能够减少不必要的尝试 
	return 0; 
}
