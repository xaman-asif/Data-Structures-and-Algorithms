#include <bits/stdc++.h>
using namespace std;

typedef struct node Node;

struct node {
    int data;
    Node *next;
};

//Creating a node
Node *create_node (int item, Node *next)
{
    Node *new_node = (Node *) malloc(sizeof(Node));
    if (new_node == NULL)
    {
        printf("Error! Could not create a new node\n");
        exit(1);
    }
    new_node->data = item;
    new_node->next = next;
}

int main()
{
    Node *p;
    p = create_node(10, NULL);
    printf("Data: %d\n",p->data);
    return 0;
}
