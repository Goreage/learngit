#include<iostream>
using namespace std;
#define rows 8;
#define k 8;
int a[8][8];
int b[8][8];
int c[8][8];	//结果
int main()
{
	int m, n, p, q;
	cin >> m >> n;
	for (int i = 0; i < m; ++i)	//读入a矩阵
		for (int j = 0; j < n; ++j)
			cin >> a[i][j];
	cin >> p >> q;
	for (int i = 0; i < p; ++i)		//读入b矩阵
		for (int j = 0; j < q; ++j)
			cin >> b[i][j];
	for (int i = 0; i < m; ++i) {
		for (int j = 0; j < q; ++j) {
			c[i][j] = 0;
			for (int k = 0; k < n; ++k)
				c[i][j] += a[i][k] * b[k][j];
		}
	}
	for (int i = 0; i < m; ++i) {
		for (int j = 0; j < q; ++j) {
			cout << c[i][j] << " ";
		}
		cout << endl;
	}
	return 0;
}
