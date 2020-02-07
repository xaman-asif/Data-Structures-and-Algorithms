#include <stdio.h>

void iSort(int ara[], int n)
{
    for(int i=1; i<n; i++)
    {
        int x = ara[i];
        int j = i - 1;
        while (j >= 0 && ara[j] > x)
        {
            ara[j+1] = ara[j];
            j--;
        }
        ara[j+1] = x;
    }
}

int main()
{
    int ara[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    iSort(ara, 10);
    for(int i=0; i<10; ++i)
        printf("%d ", ara[i]);
    return 0;
}
