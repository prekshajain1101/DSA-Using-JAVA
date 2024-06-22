package Recursion;
import java.util.*;
public class Displayarrayreverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        displayreverse(arr, 0);
    }
    public static void displayreverse(int arr [] , int idx){
        if(idx == arr.length){
            return;
        }
        displayreverse(arr, idx+1);
        System.out.println(arr[idx]);
    }
}
