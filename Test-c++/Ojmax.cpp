#include<iostream>
using namespace std;
int main(){
	int n, mx = 0;
	while(scanf("%d",&n) != EOF){
		//��cin >> n 
		//�� while(scanf("%d",&n) == 1){
		if( n > mx )
				mx = n; 
	}
	printf("%d",mx);
	return 0;
}
//�������ɸ�����֪���ж��ٸ�����������������е����ֵ
//Sample Input:
// 
