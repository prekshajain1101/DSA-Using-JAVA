package Recursion;
import java.util.*;
public class firstIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        System.out.println(getFirstIndex(arr, 0, x));
    }
    public static int getFirstIndex(int arr[] , int idx , int x){
        if(arr[idx] == arr.length){
            return -1;
        }
        if(arr[idx] == x){
            return idx;
        }
    return getFirstIndex(arr, idx+1, x);
    }
}
