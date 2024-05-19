#include <bits/stdc++.h>
using namespace std;

struct tree
{
  char data;
  tree *left;
  tree *right;
};

typedef struct tree node;

void InOrder(node *root)
{
  if (root->left != NULL)
    InOrder(root->left);
  printf("%c", root->data);
  if (root->right != NULL)
    InOrder(root->right);
}
void CreateTree(node *root)
{
  char ans;

  fflush(stdout);
  printf("%c has any left child? ", root->data);

  fflush(stdin);
  scanf("%c", &ans);

  if (toupper(ans) == 'Y')
  {
    root->left = new node();
    fflush(stdout);
    printf("Enter Left Child Data of %c: ", root->data);
    fflush(stdin);
    scanf("%c", &root->left->data);
  }
  else
    root->left = NULL;
  fflush(stdout);
  printf("%c has any right child?: ", root->data);
  fflush(stdin);
  scanf("%c", &ans);
  if (toupper(ans) == 'Y')
  {
    root->right = new node();
    fflush(stdout);
    printf("Enter Right Child Data of %c: ", root->data);
    fflush(stdin);
    scanf("%c", &root->right->data);
  }
  else
    root->right = NULL;

  CreateTree(root->left);
  CreateTree(root->right);
}
int main()
{
  node *root = new node();
  printf("Enter Root Data: ");
  scanf("%c", &root->data);
  CreateTree(root);
  InOrder(root);
  return 0;
}
