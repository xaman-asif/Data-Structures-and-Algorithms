#include <bits/stdc++.h>

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
    node previous_node = NULL;
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

int main()
{
    append(1);
    append(2);
    append(3);
    print();
    return 0;
}

Thanks to : https://www.shafaetsplanet.com/planetcoding/?p=2689















