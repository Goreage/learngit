#include<stdio.h>
#include<string.h>

/*
���ַ����������Ա�ʾ��˭��˭��Ҳû�ж���
*/

int mycmp(const char* s1, const char * s2)
/*
������ķ�ʽ��дstrcmp������Ҳ�����Ż�
*/
{
	int idx = 0;
	while (s1[idx] == s2[idx] && s1[idx] != '\0') {
		idx++;
	}
	return s1[idx] - s2[idx];
}

int myextendscmp(const char *s1, const char *s2)
{
	/*
	use pointer expession strcmp calss
	*/
	while (*s1 == *s2 && *s1 != '\0') {
		s1++;
		s2++;
	}
	return *s1 - *s2;
}

int main(int argc, char const *argv[])
{
	char s1[] = "abc";
	char s2[] = "Abc";
	printf("%d\n", myextendscmp(s1, s2));
	printf("%d\n", 'a' - 'A');

	return 0;
}