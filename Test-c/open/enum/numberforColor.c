#include<stdio.h>

enum COLOR { RED, YELLOW, GREEN, NumCOLORS };

int main(int argc, char const *argv[])
{
	int color = -1;
	char *ColorNames[NumCOLORS] = {
		"red","yellow","green",
	};
	char *colorName = NULL;

	printf("������ϲ������ɫ�Ĵ���:");
	scanf_s("%d", &color);
	if (color >= 0 && color < NumCOLORS) {
		colorName = ColorNames[color];
	}
	else {
		colorName = "unknown";
	}
	printf("��ϲ������ɫ��%s\n", colorName);
	return 0;
}