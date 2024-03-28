package Array;
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int idx = 0 ; idx < n ; idx++){
            arr[idx] = scn.nextInt();
        }
        int r = scn.nextInt();
        r = r % n;
        if(r < 0){
            r = r + n;
        }
        reverse(arr , n-r , n-1);//Part2 of Array
        reverse(arr , 0 , n-r-1);//Part 2 of Array
        reverse(arr , 0 , n-1);//Whole Array
        for(int idx = 0 ; idx < n ; idx++){
            System.out.println(arr[idx]);
        }

    }
    public static void reverse(int arr[] , int lo , int hi){
        while(lo < hi){
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }
}
