package Recursion;
import java.util.*;
public class maxofarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(maxarray(arr , 0));
    }
    public static int maxarray(int arr[] , int idx){
        if( idx == arr.length){
            return Integer.MIN_VALUE;
        }
        int res = maxarray(arr, idx+1);
        if( res > arr[idx]){
            return res;
        }
    return arr[idx];
    }
}
