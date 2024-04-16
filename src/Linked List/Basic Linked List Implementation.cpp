#include <bits/stdc++.h>
using namespace std;

struct node
{
	int data;
	node *next;
};

node *root = NULL;

void append (int data)
{
	//see if the linked list was empty at the first place
	if (root == NULL)
	{
		root = new node();
		root -> data = data;
		root -> next = NULL;
	}
	else
	{
		//copying address of root node to another node
		node *current_node = root;
		while (current_node->next != NULL)
		{
			current_node = current_node -> next;
			//go to the next address
		}
		//creating a new node
		node *newnode = new node();
		newnode->data = data;
		newnode->next = NULL;
		//added new node to the end of linked list
		//set up null to the end of latest node
		current_node->next = newnode;
	}
}

void print()
{
    node *current_node = root;
    //loop will continue untill linked list ends
    while(current_node != NULL)
    {
        printf("%d\n", current_node->data);
        current_node = current_node->next;
    }
}

void delete_node (int data)
{
    node *current_node = root;
    node *previous_node = NULL;
    //searching for the node
    while (current_node->data != data)
    {
        //save the previous node before exit
        previous_node = current_node;
        current_node = current_node->next;
    }
    //see if root is the wanted node then delete
    if(current_node==root)
    {
        node *temp = root;
        root = root->next;
        delete(temp);
    }
    //it is non-root then also delete
    else
    {
        //previous node points current node's next node
        //and delete current node anyway
        previous_node->next = current_node->next;
        delete(current_node);
    }
}

void add_node (int data1, int data2, int data)
{
    node *current_node = root;
    node *previous_node = NULL;
    //searching for these two nodes
    while (current_node->data != data1 && current_node->next->data != data2)
    {
        previous_node = current_node;
        current_node = current_node->next;
    }
    //creating a new node
    node *newnode = new node();
    newnode->data = data;
    //injecting new node between two nodes
    newnode->next = current_node->next;
    current_node->next = newnode;
}

int main()
{
    append(1);
    append(2);
    add_node(2, 3, 5);
    append(3);
    print();
    return 0;
}
