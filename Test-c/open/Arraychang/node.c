#include "node.h"
#include<stdio.h>

void add(Node* head, int number);
void print(List *pList);

/*typedef struct _node {
int value;
struct _node *next;
}Node;
*/

typedef struct _list {
	Node* head;
	//	Node* tail;  //tail可以指向最后的元素，这个功能可以开发
}List;

/*
用list 和 head来表示看起来好像没什么一样，但我们自己定义了一种List结构
*/

int main(int argc, char const *argv[])
{
	List list;
	list.head = NULL;
	//list.tail =NULL

	int number;
	do {
		scanf_s("%d", &number);
		if (number != -1) {
			add(&list, number);
		}
	} while (number != -1);
	print(&list);

	/*
	输入一个数字，编写一个方法来寻找是否这个数字在这个数组中。
	*/
	scanf_s("%d", &number);
	Node *p;
	int isFound = 0;
	for (p = list.head; p; p = p->next) {
		if (p->value == number) {
			printf("找到了\n");
			isFound = 1;
			break;
		}
	}
	if (!isFound) {
		printf("没找到\n");
	}

	/*
	找到这个数字，要做删除操作，将它的前一个数字的next跳过这个数字指向
	下一个数字的head ;   如果出现找的数是第一个， 它的前一个数的next 为 NULL 直接用
	list.head = p-> next;
	*/
	Node *q;
	for (q = NULL, p = list.head; p; q = p, p = p->next) {
		if (p->value == number) {
			if (q) {
				q->next = p->next;
			}
			else {
				list.head = p->next;
			}
			free(p);
			break;
		}
	}

	//最后的操作删除链表

	for (p = list.head; p; p = q) {
		q = p->next;
		free(p);
	}
	return 0;
}
void add(List* pList, int number)
{
	//add to linked list
	Node *p = (Node*)malloc(sizeof(Node));
	p->value = number;
	p->next = NULL;
	//find the last
	Node *last = pList->head;
	if (last) {
		while (last->next) {
			last = last->next;
		}
		//attach
		last->next = p;
	}
	else {
		pList->head = p;
	}
}
/*
函数的输出形式，遍历数组
*/
void print(List *pList) {
	Node *p;
	for (p = pList->head; p; p = p->next) {
		printf("%d\t", p->value);
	}
	printf("\n");
}