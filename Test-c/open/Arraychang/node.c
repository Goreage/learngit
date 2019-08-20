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
	//	Node* tail;  //tail����ָ������Ԫ�أ�������ܿ��Կ���
}List;

/*
��list �� head����ʾ����������ûʲôһ�����������Լ�������һ��List�ṹ
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
	����һ�����֣���дһ��������Ѱ���Ƿ������������������С�
	*/
	scanf_s("%d", &number);
	Node *p;
	int isFound = 0;
	for (p = list.head; p; p = p->next) {
		if (p->value == number) {
			printf("�ҵ���\n");
			isFound = 1;
			break;
		}
	}
	if (!isFound) {
		printf("û�ҵ�\n");
	}

	/*
	�ҵ�������֣�Ҫ��ɾ��������������ǰһ�����ֵ�next�����������ָ��
	��һ�����ֵ�head ;   ��������ҵ����ǵ�һ���� ����ǰһ������next Ϊ NULL ֱ����
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

	//���Ĳ���ɾ������

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
�����������ʽ����������
*/
void print(List *pList) {
	Node *p;
	for (p = pList->head; p; p = p->next) {
		printf("%d\t", p->value);
	}
	printf("\n");
}