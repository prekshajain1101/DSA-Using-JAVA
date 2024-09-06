package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Paintmanyhouses {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 5;
        int arr[][] = {{1,5,10,0,9}, {11,6,8,1,4},{9,8,97,100,10},{150,140,130,120,90},{60,70,80,10,5}};
        System.out.println(paint(arr, n));
        System.out.println(paint2(arr, n));
    }
    public static int paint(int arr[][], int n){
        int m = arr[0].length;
        int dp[][] = new int[n][m];
        for(int col = 0 ; col < m ; col++) dp[0][col] = arr[0][col];
        for(int row = 1 ; row < n ; row++){
            for(int col = 0 ; col < m ; col++){
                int min = Integer.MAX_VALUE;
                for(int mIdx = 0 ; mIdx < m ; mIdx++){
                    min = (mIdx != col && min > dp[row-1][mIdx]) ? dp[row-1][mIdx] : min;
                    dp[row][col] = arr[row][col] + min;
                }
            }
        }
        for(int i = 0; i < n; i++) System.out.println(Arrays.toString(dp[i]));
        int ans = Integer.MAX_VALUE;
        for(int col = 0 ; col < m ; col++){
            ans = ans > dp[n-1][col] ? dp[n-1][col] : ans;
        }
        return ans;
    }
//2nd option
    public static int paint2(int arr[][] , int n){
        int m = arr[0].length;
        int dp[][] = new int[n][m];
        for(int col = 0 ; col < m ; col++) dp[0][col] = arr[0][col];
        for(int row = 1 ; row < n ; row++){
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            int mIdx = -1;
            for(int col = 0 ; col < m ; col++){
                if(min1 > dp[row-1][col]){
                    min2 = min1;
                    min1 = dp[row-1][col];
                    mIdx = col;
                }
                else if (min2 > dp[row-1][col]){
                    min2 = dp[row-1][col];
                }
            }
            for(int col = 0 ; col < m ; col++){
                if(col == mIdx){
                    dp[row][col] = arr[row][col] + min2;
                }
                else{
                    dp[row][col] = arr[row][col] + min1;
                }
            }
            
        }
        int ans = Integer.MAX_VALUE;
        for(int col = 0 ; col < m ; col++){
            ans = ans > dp[n-1][col] ? dp[n-1][col]: ans;
        }
        return ans;
    }
}
