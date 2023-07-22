package org.session.example.sortingalgo;

public class QuickSort {
    public static void main(String[] args) {
        //int a[] = {2,1,5,6,7,9,5,4};
        int a [] = {24,9, 29, 14, 19, 27};
        int n = a.length;
        QuickSort quickSort = new QuickSort();
        System.out.println("Before sorting array elements : ");
        quickSort.print(a,n);
        quickSort.quickSort(a,0,n-1);
        System.out.println();
        System.out.println("After sorting array elements : ");
        quickSort.print(a,n);
    }
    void print(int a[], int length){
        for (int i=0; i<length; i++)
            System.out.print(a[i]+ " ");
    }
    void quickSort(int a[], int start, int end){
        if (start<end){
            int p = partition(a,start,end);
            quickSort(a,start,p-1);
            quickSort(a,p+1,end);
        }
    }
    int partition(int a[], int start, int end){
        int pivote = a[end];
        int i = (start-1);
        for (int j=start; j<=end-1; j++){
            if (a[j]<pivote){ // 24<27
                i++;
                int temp=a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
            int temp = a[i+1];
            a[i+1] = a[end];
            a[end] = temp;
            return (i+1);
    }
}
