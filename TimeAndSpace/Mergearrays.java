package TimeAndSpace;

import java.util.Arrays;
import java.util.Scanner;

public class Mergearrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int arr1[] = new int[n1];
        for(int i = 0 ; i < n1; i++){
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        for(int i = 0 ; i < n2; i++){
            arr2[i] = scn.nextInt();
        }
        int arr[] = mergetwoarrays(n1, arr1, n2, arr2);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergetwoarrays(int n1 , int arr1[] , int n2 , int arr2[]){
        int res[] = new int[n1+n2];
        int i = 0 , j = 0 , k = 0;
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                res[k] = arr1[i];
                i++;
                k++;
            }
            else if(arr1[i] > arr2[j]){
                res[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < n1){
            res[k] = arr1[i];
            i++;
            k++;
        }
        while(j < n2){
            res[k] = arr2[j];
            j++;
            k++;
        }
        return res;
    }
}
