package TimeAndSpace;

import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        sorting(arr);
    }
    public static void sorting(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int val : arr){
            if(val > max){
                max = val;
            }
        }
        int count = 0 ;
        while(max != 0){
            count++;
            max = max / 10;
        }
        int exp = 1;
        while(count != 0){
            CountSort(arr, exp);
            count --;
            exp = exp * 10;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void CountSort(int arr[] , int exp){
        int freq[] = new int[10];
        for(int vl : arr){
            freq[(vl/exp)%10]++;
        }
        for(int i = 1 ; i < 10 ; i++){
            freq[i] += freq[i-1];
        }
        int res[] = new int[arr.length];
        for(int i = arr.length-1 ; i>= 0 ; i--){
            int val = arr[i];
            int pos = (val/exp)%10;
            int place = freq[pos];
            res[place-1] = val;
            freq[pos]--;
        }
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = res[i];
        }
    }
}
