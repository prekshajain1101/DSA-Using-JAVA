package Array;
import java.util.*;
public class Subarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int [n];
        for(int idx = 0 ; idx< n ; idx++){
            arr[idx] = scn.nextInt();
        }
        for(int i=0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                for(int k = i ; k < j ; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
