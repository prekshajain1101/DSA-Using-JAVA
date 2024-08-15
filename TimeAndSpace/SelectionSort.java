package TimeAndSpace;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        sorting(arr, n);    
    }
    public static void sorting(int arr[],int n){
        for(int i = 1 ; i < n ; i++){
            int minIdx = i -1;
            for(int j = i ; j < n ; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i-1];
            arr[i-1] = arr[minIdx];
            arr[minIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
