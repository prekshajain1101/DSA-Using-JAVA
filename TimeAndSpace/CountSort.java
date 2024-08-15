package TimeAndSpace;

import java.util.Arrays;
import java.util.Scanner;

public class CountSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
            min = Math.min(min , arr[i]);
            max = Math.max(max , arr[i]);
        }
        sorting(n, arr, min, max);
    }
    public static void sorting(int n , int[] arr , int min , int max){
        int range = max - min + 1;
        int freq[] = new int[range];
        for(int val : arr){
            int pos = val - min;
            freq[pos]++;
        }
        for(int i = 1 ; i < range ; i++){
            freq[i] += freq[i-1];
        }
        int res[] = new int[range];
        for(int i = n-1 ; i >= 0 ; i--){
            int val = arr[i];
            int pos = val - min;
            int place = freq[pos];
            res[place-1] = arr[i];
            freq[pos]--;
        }
        for(int i = 0 ; i < n ; i++){
            arr[i] = res[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
