#include<stdio.h>

struct point
{
	int x;
	int y;
};

/*p-> month = 12;
用->表示指针所指的结构变量中的成员
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
//两个结构变量可以赋值，数组不可以
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

//question:在getStruct中的变量的赋值不会改变main中变量的值。只能用指针
//解决的方案：完全可以创建一个临时的结构变量，然后把这个结构返回给调用者

scanf_s("%d", &p.x);
scanf_s("%d", &p.y);
printf("%d,%d", p.x, p.y);
}*/

/*struct point getStruct(void)
{

//修改后的形式， 再使用 -> 符号修改

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