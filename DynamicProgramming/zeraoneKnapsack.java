package DynamicProgramming;

import java.util.Scanner;

public class zeraoneKnapsack {
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
        int dp[] []= new int[n+1][k+1];
        for(int r = 1 ; r<= n ; r++){
            int wt = arr2[r-1];
            int vl = arr1[r-1];
            for(int c = 1 ; c <= k ; c++){
                dp[r][c] = dp[r-1][c];
                if(c >= wt){
                    dp[r][c] = Math.max(dp[r-1][c-wt]+vl,dp[r][c]);
                }
            }
        }
        System.out.println(dp[n][k]);
    }
}
