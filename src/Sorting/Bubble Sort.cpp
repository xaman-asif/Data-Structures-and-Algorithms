#include <bits/stdc++.h>
using namespace std;

void bubbleSort(int ara[], int n)
{
    for (int i=0; i < n - 1; ++i)
    {
        for (int j = 0; j < n - i - 1; ++j)
        {
            if(ara[j] > ara[j+1])
            {
                swap(ara[j], ara[j+1]);
            }
        }
    }
}

int main()
{
    int ara[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int n = sizeof(ara) / sizeof(int);
    bubbleSort(ara, n);
    for(int i=0; i<n; ++i)
        printf("%d ", ara[i]);
    return 0;
}
