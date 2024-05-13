//https://www.shafaetsplanet.com/planetcoding/?p=2689

#include <bits/stdc++.h>
using namespace std;

struct node
{
    int roll;
    node *next;
};

node *root = NULL;

void append(int roll)
{
    if (root == NULL) // if the list is empty
    {
        root = new node(); // create new node in root
        root->roll = roll;
        root->next = NULL;
    }
    else
    {
        node *current_node = root;         // make a copy of root node
        while (current_node->next != NULL) // find the last node
        {
            current_node = current_node->next; // go to the next address
        }

        node *newnode = new node(); // create a new node
        newnode->roll = roll;
        newnode->next = NULL;

        current_node->next = newnode; // link the last node with new node
    }
}

void print()
{
    node *current_node = root;
    while (current_node != NULL) // loop until you reach null
    {
        printf("%d\n", current_node->roll);
        current_node = current_node->next;
    }
}

void delete_node(int roll)
{
}

int main()
{
    append(1);
    append(2);
    append(6);
    print();
    return 0;
}
