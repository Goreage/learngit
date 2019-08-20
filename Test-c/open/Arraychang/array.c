#include "array.h"
#include<stdio.h>
#include<stdlib.h>

/*typedef struct{

int *array;
int size;
}Array;
*/

const BLOCK_SIZE = 10;
/*
创建数组的函数,这只是这一种可能
*/
Array array_create(int init_size)
{
	Array a;
	a.array = (int*)malloc(sizeof(int)*init_size);
	a.size = init_size;
	return a;
}
void array_free(Array *a)
{
	/*
	free(0) free(null)是无害的
	*/
	free(a->array);
	a->array = 0;
	a->size = 0;
}
//封装
int array_size(const Array *a)
{
	return a->size;
}
int *array_at(Array *a, int index)
{
	/*
	如果数组越界可以每次增加一个BLOCK_SIZE个空间以应对
	*/
	if (index > a->size) {
		array_inflate(a, (index / BLOCK_SIZE + 1)*BLOCK_SIZE - a->size);
	}
	return &(a->array[index]);
	//返回这个数的指针, 可以对这个数的指针赋值
}
int array_get(const Array *a, int index)
{
	return a->array[index];
}
void array_set(Array *a, int index, int value)
{
	a->array[index] = value;
}

void array_inflate(Array *a, int more_size)
{
	/*
	无限读入自动增长的数组
	*/
	int *p = (int*)malloc((int)(a->size + more_size));
	int i;
	for (i = 0; i < a->size; i++)
	{
		p[i] = a->array[i];
	}
	free(a->array);
	a->array = p;
	a->size += more_size;
}

int main(int arg, char const *argv[])
{
	Array a = array_create(100);
	//表示数组a的大小的两种方式，区别是封装
	printf("%d\n", array_size(&a));
	//printf("%d\n", a.size);

	*array_at(&a, 0) = 10;
	printf("%d\n", *array_at(&a, 0));

	int number = 0;
	int cnt = 0;
	while (number != -1) {
		scanf("%d\n", &number);
		if (number != -1) {
			*array_at(&a, cnt++) = number;
		}
	}
	array_free(&a);

	return 0;
}