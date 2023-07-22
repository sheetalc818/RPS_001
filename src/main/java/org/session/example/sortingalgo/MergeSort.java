package org.session.example.sortingalgo;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = {2,1,5,6,7,9,5,4};
        int n = a.length;
        MergeSort mergeSort = new MergeSort();
        System.out.println("Before sorting array elements : ");
        mergeSort.print(a,n);
        mergeSort.mergeSorting(a, 0, n-1);
        System.out.println(" ");
        System.out.println("After sorting array elements : ");
        mergeSort.print(a,n);
        System.out.println(" ");
    }

    void print(int a[], int length){
        for (int i=0; i<length; i++){
            System.out.print(a[i] + " ");
        }
    }

    void mergeSorting(int a[], int beg, int end){
        if(beg<end){
            int mid = (beg+end)/2;
            //System.out.println("Mid : "+mid);
            mergeSorting(a, beg, mid);
            mergeSorting(a,mid+1,end);
            merge(a,beg,mid,end);
        }
    }

    void merge(int a[], int beg, int mid, int end){
        int n1 = mid-beg+1;
        int n2 = end-mid;
        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];
        for (int i = 0; i<n1; i++)
            LeftArray[i]=a[beg+i];
        for (int j=0; j<n2; j++)
            RightArray[j]= a[mid+1+j];
        int i=0;
        int j=0;
        int k = beg;
        while(i<n1&&j<n2){
            if(LeftArray[i]<=RightArray[j]){
                a[k] = LeftArray[i];
                i++;
            }else {
                a[k]=RightArray[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            a[k]=LeftArray[i];
            i++;
            k++;
        }

        while (j<n2){
            a[k]=RightArray[j];
            j++;
            k++;
        }
    }
}
