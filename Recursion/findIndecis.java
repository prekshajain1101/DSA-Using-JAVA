package Recursion;
import java.util.*;
public class findIndecis {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int ans[] = allindecies(arr, x, 0, 0);
        for(int val : ans){
            System.out.println(val);
        }
    }
    public static int[] allindecies(int arr[] , int x , int idx , int fsf){
        if(idx == arr.length){
            int res [] = new int[fsf];
            return res;
        }
        if(arr[idx] == x){
            int res[] = allindecies(arr, x, idx+1, fsf+1);
            res[fsf] = idx;
            return res;
        }
        return allindecies(arr, x, idx+1, fsf);
    }
}
