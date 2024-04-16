#include <bits/stdc++.h>
using namespace std;

typedef struct node Node;
Node *head;
struct node {
    int data;
    Node *next;
};

Node *remove_node (Node *head, Node *node)
{
    if (node == head) {
        head = node->next;
        free(node);
        return head;
    }
    Node *current_node = head;
    while (current_node != NULL) {
        if (current_node->next == node) break;
        current_node = current_node->next;
    }
    if (current_node == NULL) {
        return head;
    }
    current_node->next = node->next;
    free(node);
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
    b->next=c;
    c->data=30;
    c->next=NULL;
    
    head = a;
    
    remove_node(head, b);
    
    while(head!=NULL)
    {
        printf("%d\n",head->data);
        head = head->next;
    }
    
    return 0;
}
