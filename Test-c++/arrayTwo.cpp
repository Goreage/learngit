//矩阵乘法
//输入第一行是整数m,n，表示第一个矩阵m行n列。
//接下来是一个n行k列矩阵
//要求输出两个矩阵相乘的结果矩阵（1<m,n,p,q<= 8）
#include<iostream>
using namespace std;
#define ROWS 8
#define COLS 8
int a[ROWS][COLS];
int b[ROWS][COLS];
int c[ROWS][COLS];	//结果
int main()
{
	int m,n,p,q;
	cin >> m >> n;
	for(int i=0; i<m; ++i)	//读入a矩阵
			for(int j=0; j<n; ++j)
					cin >> a[i][j];
	cin >> p >> q;
	for(int i=0; i<p; ++i)	//读入b矩阵
			for(int j=0; j<q; ++j) {
					cin >> b[i][j];
			}	
	}
	for(int i=0; i<m; ++i){
		for(int j=0; j<q; ++j){
				c[i][j] = 0;
				for(int k=0; k<n; ++k)
					c[i][j] += a[i][k] * b[k][j];
		}
	}
	for(int i=0; i<m; ++i){
		for(int j=0; j<q; ++j){
				cout << c[i][j] << " ";
		}
		cout << endl;
	}
	return 0;
 } 
