#include<stdio.h>

struct point
{
	int x;
	int y;
};

/*p-> month = 12;
��->��ʾָ����ָ�Ľṹ�����еĳ�Ա
*/

//struct point getStruct(void);

struct point* getStruct(struct point*);

//void getStruct(struct point);
void output(struct point);

void print(const struct point *p);

/*void main()
{
struct point y = { 0,0 };
getStruct(y);
output(y);
}*/

/*void main()
{
struct point y = { 0,0 };
//�����ṹ�������Ը�ֵ�����鲻����
y = getStruct();
output(y);
}
*/
int main(int arg, char const *argv[])
{
	struct point y = { 0,0 };
	getStruct(&y);
	output(y);
	output(*getStruct(&y));
	print(getStruct(&y));
}

/*void getStruct(struct point p)
{

//question:��getStruct�еı����ĸ�ֵ����ı�main�б�����ֵ��ֻ����ָ��
//����ķ�������ȫ���Դ���һ����ʱ�Ľṹ������Ȼ�������ṹ���ظ�������

scanf_s("%d", &p.x);
scanf_s("%d", &p.y);
printf("%d,%d", p.x, p.y);
}*/

/*struct point getStruct(void)
{

//�޸ĺ����ʽ�� ��ʹ�� -> �����޸�

struct point p;
scanf_s("%d", &p.x);
scanf_s("%d", &p.y);
printf("%d,%d", p.x, p.y);
return p;
}
*/

struct point* getStruct(struct point *p)
{
	scanf_s("%d", &p->x);
	scanf_s("%d", &p->y);
	printf("%d, %d", p->x, p->y);
	return p;
}


void inputPoint()
{
	struct point temp;
	scanf_s("%d", &temp.x);
	scanf_s("%d", &temp.y);
	return temp;
}

void output(struct point p)
{
	printf("%d,%d", p.x, p.y);
}

void print(const struct point *p)
{
	printf("%d,%d", p->x, p->y);
}