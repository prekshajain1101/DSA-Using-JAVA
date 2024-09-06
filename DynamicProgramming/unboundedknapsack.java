package DynamicProgramming;

import java.util.Scanner;

public class unboundedknapsack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr1[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr1[i] = scn.nextInt();
        }
        int arr2[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr2[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int dp[] = new int[k+1];
        for(int i = 0 ; i < n ; i++){
            int wt = arr2[i];
            int vl = arr1[i];
            for(int j = wt ; j <= k ; j++){
                dp[j] = Math.max(dp[j] , vl + dp[j-wt]);
            }
        }
        System.out.println(dp[k]);
    }
}
