#include <bits/stdc++.h>
using namespace std;

typedef struct node Node;

struct node {
    int data;
    Node *next;
};

Node *head = NULL;

Node *create_node (int item, Node *next)
{
    Node *new_node = (Node *) malloc(sizeof(Node));
    if (new_node == NULL)
    {
        printf("Error! Couldn't create a new node\n");
        exit(1);
    }
    new_node->data = item;
    new_node->next = next;
}

Node *append(Node *head, int item)
{
    Node *new_node = create_node(item, NULL);
    if(head == NULL){
        return new_node;
    }
    Node *current_node = head;
    while (current_node->next != NULL){
        current_node = current_node->next;
    }
    current_node->next = new_node;
    return head;
}

int main()
{
    Node *a = (Node *) malloc(sizeof(Node));
    Node *b = (Node *) malloc(sizeof(Node));
    Node *c = (Node *) malloc(sizeof(Node));

    a->data=10;
    a->next=b;
    b->data=20;
    b->next=NULL;
    //Appending 30 after A then B
    head = a;
    append(head, 30);
    //Printing linked list
    Node *current_node = head;
    while(current_node!=NULL)
    {
        printf("%d\n",current_node->data);
        current_node=current_node->next;
    }
    return 0;
}