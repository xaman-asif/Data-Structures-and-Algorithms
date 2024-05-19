Thanks to Shafaets Blog || Resource: http://www.shafaetsplanet.com/planetcoding/?p=211
#include <cstdio>
#include <vector>
using namespace std;

#define MAX 100000
vector <int> edges[MAX];

void print(int nedges);
void inDegree(int nedges);
void outDegree();
int main()
{
  int nnodes, nedges;
  printf("How many nodes and edges? \n");
  scanf("%d %d", &nnodes, &nedges);
  //Entering Directed Adjacency List
  for(int i=1; i <= nedges; i++)
  {
    int x, y;
    printf("Enter Node P to Q: ");
    scanf("%d %d", &x, &y);
    edges[x].push_back(y);
  }
  //Printing Graph
  print(nedges);
  //How many incoming edges in a node?
  inDegree(nedges);
  //How many outgoing edges from a node?
  outDegree();
  return 0;
}
void print(int nedges)
{
  for(int i=1; i <= nedges; i++)
  {
    for(int j=0; j < edges[i].size(); j++)
      printf("%d %d\n", i, edges[i][j]);
  }
}
void inDegree(int nedges)
{
  printf("Which Node inDegree?\n");
  int x; scanf("%d", &x);
  for(int i=1; i <= nedges; i++)
  {
    for(int j=0; j < edges[i].size(); j++)
      if(x==edges[i][j])
        printf("%d\n",i);
  
}
void outDegree()
{
  printf("Which Node outDegree?\n");
  int x; scanf("%d", &x);
  for(int i=0; i < edges[x].size(); i++)
    printf("%d\n", edges[x][i]);
}
