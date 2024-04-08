package Array;

import java.util.*;

public class InverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = sc.nextInt();
        }
        int inverse[] = new int[arr.length];
        for(int idx = 0 ; idx < n ; idx++){
        int val = arr[idx];
        inverse[val] = idx;
        }
        for(int idx = 0; idx < n; idx++){
            System.out.print(inverse[idx]);
        }
    }
}
