#include <bits/stdc++.h>
using namespace std;

typedef struct node {
	int val;
	struct node *next;
} Node;

Node *head = (Node *) malloc(sizeof(Node));

void printlist () {
	Node *current = head;
	while (current != NULL)
	{
		printf("%d\n", current->val);
		current = current->next;
	}
	
}

void append (int data) {
	Node *current = head;
	Node *newnode = (Node *) malloc(sizeof(Node));
	newnode->val = data;
	newnode->next = NULL;
	while (current->next != NULL)
	{
		current = current->next;
	}
	current->next = newnode;
}

void prepend (int data) {
	Node *newnode = (Node *) malloc(sizeof(Node));
	newnode->val = data;
	newnode->next = head;
	head = newnode;
}

int main() {
	Node *start = (Node *) malloc(sizeof(Node));
	start->val=1;
	start->next=NULL;
	head = start;
	prepend(5);
	append(2);
	printlist();
	return 0;
}
