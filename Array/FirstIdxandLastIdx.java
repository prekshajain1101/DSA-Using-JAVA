package Array;
import java.util.*;
public class FirstIdxandLastIdx {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(FirstIdx(arr, k));
        System.out.println(LastIdx(arr, k));
    }
    public static int FirstIdx(int arr[] , int k){
        int fi = -1 , lo =0 , hi = arr.length - 1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==k){
                fi = mid;
                hi = mid-1;
            }
            else if(k > arr[mid]){
                lo = mid +1;
            }
            else{
                hi = mid-1;
            }
        }
        return fi;
    }
    public static int LastIdx(int arr[] , int k){
        int li = -1 , lo =0 , hi = arr.length - 1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==k){
                li = mid;
                lo = mid+1;
            }
            else if(k > arr[mid]){
                lo = mid +1;
            }
            else{
                hi = mid-1;
            }
        }
        return li;
    }
}
