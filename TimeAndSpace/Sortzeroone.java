package TimeAndSpace;

import java.util.Arrays;
import java.util.Scanner;

public class Sortzeroone {
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
        int i = 0 , j = 0;
        while (i < n) {
            if(arr[i] == 1){
                i++;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
