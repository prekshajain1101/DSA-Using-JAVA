package TimeAndSpace;

import java.util.Scanner;

public class BubbleSort {
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
            for(int j = 0 ; j <= n-i-1 ; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int k = 0 ; k < n ; k++){
            System.out.println(arr[k]);
        }
    }
}
