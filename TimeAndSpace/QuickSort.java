package TimeAndSpace;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        sorting(arr, n, n);
    }
    public static void sorting(int arr[] , int lo , int hi){
        if(lo > hi){
            return;
        }
            int pivot = arr[hi];
            int pidx = partition(arr, pivot, lo, hi);
            sorting(arr, lo, pidx-1);
            sorting(arr, pidx+1 , hi);
        System.out.println(Arrays.toString(arr));
    }
    public static int partition(int arr[] , int pivot , int lo , int hi){
        int i = lo , j = lo;
        while(i <= hi){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return (j-1);
    }
}
