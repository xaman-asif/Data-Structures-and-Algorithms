#include <bits/stdc++.h>
using namespace std;

void merger(int A[], int left, int mid, int right){
    //Just guessing some integers forget it for now
    int i, left_array_size, right_array_size, index_a, index_l, index_r;
    //We detemined array lengths of two parts returned earlier
    left_array_size = mid - left + 1;
    right_array_size = right - mid;
    //We created two arrays to store two arrays temporarily here
    int L[left_array_size], R[right_array_size];
    //We just copied one of the two arrays 
    for(i = 0; i < left_array_size; ++i){
        L[i] = A[left + i];
    }
    //We copied another one
    for(i = 0; i < right_array_size; ++i){
        R[i] = A[mid + 1 + i];
    }
    
    index_l = 0; index_r = 0;
    //In this portion we will merge two sorted array in that big array
    for(index_a = left; index_l < left_array_size && index_r < right_array_size; index_a++){
        if(L[index_l] < R[index_r]) {
            A[index_a] = L[index_l];
            index_l++;
        } else {
            A[index_a] = R[index_r];
            index_r++;
        }
    }
    //There will be some value in left array or right array unchanged we will take care about them here. Use your brain
    while(index_l < left_array_size) {
        A[index_a] = L[index_l];
        index_l++;
        index_a++;
    }
    
    while(index_r < right_array_size) {
        A[index_a] = R[index_r];
        index_r++;
        index_a++;
    }
}

void mergeSort(int A[], int left, int right)
{
    if(left >= right){
        //if array has only one element then left == right
        //if array has zero element then left > right
        //then the array is already sorted because of only one element
        //so we will return
        return;
    }
    //we have to divide array in two parts, so we have to determine mid
    //first half of array will be left --> mid and the rest will be mid + 1 --> right
    int mid = (left + right) / 2;
    //we are sorting first half left --> mid
    mergeSort(A, left, mid);
    //we are sorting second half mid+1 --> right
    mergeSort(A, mid+1, right);
    //we are going to merge two arrays we called just now
    merger(A, left, mid, right);
}

int main()
{
    int n;  printf("Enter size of your array: ");
    scanf("%d", &n);    int A[n];

    printf("Enter your array:\n");

    for(int i=0; i<n; i++)
        scanf("%d", &A[i]);
    
    printf("Array before sort: \n");
    
    for(int i=0; i<n; i++)
        printf("%d ", A[i]);
    
    mergeSort(A, 0, n-1);
    
    printf("\nArray after sort: \n");
    
    for(int i=0; i<n; i++)
        printf("%d ", A[i]);
    
    return 0;
}
//***********Thanks to Tamim Shahriar Subeen for his explaination.***********//
