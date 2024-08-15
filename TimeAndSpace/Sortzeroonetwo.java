package TimeAndSpace;

import java.util.Arrays;
import java.util.Scanner;

public class Sortzeroonetwo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        sorting(arr, n);
    }
    public static void sorting(int arr[] , int n ){
        int i = 0 , j = 0 , k = n - 1;
        while(i <= k){
            if(arr[i] == 1){
                i++;
            }
            else if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else{
                int temp1 = arr[i];
                arr[i] = arr[k];
                arr[k] = temp1;
                k--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
