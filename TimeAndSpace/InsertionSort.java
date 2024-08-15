package TimeAndSpace;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        sorting(arr, n);
    }
    public static void sorting(int arr[] , int n){
        for(int itr = 1 ; itr < n ; itr++){
            for(int j = itr ; j > 0 ; j--){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
