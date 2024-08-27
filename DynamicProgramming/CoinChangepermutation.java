package DynamicProgramming;

import java.util.Scanner;

public class CoinChangepermutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int dp[] = new int[k+1];
        dp[0] = 1;
        for(int i = 1 ; i<= k ; i++){
            for(int j = 0 ; j < n ; j++){
                if(arr[j]<=i){
                    dp[i] += dp[i-arr[j]];
                }
            }       
        }
        System.out.println(dp[k]);
    }
}
