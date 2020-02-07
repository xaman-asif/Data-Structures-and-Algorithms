#include <bits/stdc++.h>
using namespace std;

void selectionSort(int ara[], int n)
{
    for (int i=0; i < n; ++i)
    {
        for (int j = i + 1; j < n; ++j)
        {
            if(ara[i] > ara[j])
            {
                swap(ara[i], ara[j]);
            }
        }
    }
}

int main()
{
    int ara[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int n = sizeof(ara) / sizeof(int);
    selectionSort(ara, n);
    for(int i=0; i<n; ++i)
        printf("%d ", ara[i]);
    return 0;
}
