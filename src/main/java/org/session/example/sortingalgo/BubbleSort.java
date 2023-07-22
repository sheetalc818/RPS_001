package org.session.example.sortingalgo;
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {2,1,5,6,7,9,5};
        int n= a.length;
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Before sorting array elements : ");
        bubbleSort.print(a,n);
        bubbleSort.bubbleSorting(a,n);
        System.out.println();
        System.out.println("After sorting array elements : ");
        bubbleSort.print(a,n);
    }
    void print(int a[], int length){
        for (int i=0; i<length; i++){
            System.out.print(a[i] + " ");
        }
    }
    void bubbleSorting(int a[], int length){
        int temp;
        for (int i = 0;i< length;i++){
            for (int j=i+1; j<length;j++){
                if (a[j]<a[i]){
                    temp=a[i];//2
                    a[i]=a[j];//1
                    a[j]=temp;//2
                }
            }
        }
    }
}
