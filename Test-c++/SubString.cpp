#include<iostream>
using namespace std;
int Strstr(char s1[], char s2[]) {
	if (s2[0] == 0)	//判断是否是空串
		return 0;
	for (int i = 0; s1[i]; ++i) {	//枚举比较起点,找相同的元素
		int k = i, j = 0;				//编写判断子串的函数
		for (; s2[j]; ++j, ++k) {
			if (s1[k] != s2[j])
				break;
		}
		if (s2[j] == 0)
			return i;
	}
	return -1;
}