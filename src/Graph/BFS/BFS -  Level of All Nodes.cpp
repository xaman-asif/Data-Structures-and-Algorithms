#include <queue>
#include <cstring>
#include <vector>
#include <iostream>
using namespace std;

#define MAX 100

vector <int> adj[MAX];
int level[MAX];

void bfs(int s, int n)
{
  queue <int> q;
  q.push(s);
  level[s] = 1;
  while(!q.empty())
  {
    int u = q.front(); q.pop();
    for(int i=0; i < adj[u].size(); i++)
    {
      if(level[adj[u][i]]==0)
      {
        int v = adj[u][i];
        level[v] = level[u] + 1;
        q.push(v);
      }
    }
  }
  printf("Level of all nodes: \n");
  for(int i=1; i<n; i++)
    cout << i << " - " << level[i] << endl;
}



int main()
{
  int n, s;
  printf("How many edges? ");
  scanf("%d", &n);
  for(int i=1; i <= n; i++)
  {
    int x, y;
    printf("Enter Node P to Q: ");
    scanf("%d %d", &x, &y);
    adj[x].push_back(y);
    adj[y].push_back(x);
  }
  printf("Enter Source S: ");
  scanf("%d", &s);
  bfs(s, n);
  return 0;
}
