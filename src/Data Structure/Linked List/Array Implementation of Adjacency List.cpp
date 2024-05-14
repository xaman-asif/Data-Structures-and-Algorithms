#include <bits/stdc++.h>
using namespace std;

//Total Nodes 10,000    0 to 9999.
//Initalize them to -1.
int head[10000] = {-1};

//Total edge 100,000
int data[100000], next[100000];
//Global variable has initial value of 0

int id;

//add node (y) in the list of (x)
void insert(int x, int y) {
    data[id] = y;       //data is the array where data is stored in linked list
    next[id] = head[x]; //next[id] contains the address of previous node head[x]
    head[x] = id;       //head[x] is the list, it represents total number of nodes
    id++;               //let's just think it as pointer or do it on paper
}

//erase last node from head of x
void erase (int x) {
    //if you are not sure if the linked list empty check if head[x] == -1 or not
    head[x] = next[head[x]];
}

//search node (y) in the list of (x)
int search (int x, int y) {
    for(int p = head[x]; p != -1; p = next[p])  //that is the key to understand this whole thing
        //checking the data with all nodes of a adjacency list
        if(data[p] == y)
            return 1; // that is found
    return 0;         // not found
}

int main()
{
    //let's imagine this list
    /*
    0 : 1 -> 2 -> /
    1 : 0 -> 2 -> 4 -> /
    2 : 0 -> 1 -> 3 -> /
    3 : 2 -> 4 -> /
    4 : 1 -> 3 -> /
    */
    //Adding all the nodes to the corresponding list
    insert(0,1); insert(0,2);
    insert(1,0); insert(1,2); insert(1,4);
    insert(2,0); insert(2,1); insert(2,3);
    insert(3,2); insert(3,4);
    insert(4,1); insert(4,3);
    //Searching the node '4' in the list '1'
    (search(1,4)) ? printf("Found\n") : printf("Not Found\n");
    //Erasing the node '4' from the list '1'
    erase(1);
    //Again searching the node '4' in the list '1'
    (search(1,4)) ? printf("Found\n") : printf("Not Found\n");
    //Have a nice day :-)
    return 0;
}
