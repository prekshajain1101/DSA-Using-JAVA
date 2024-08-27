package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Goldmine {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int cost[][] = new int[nr][nc];
        for(int i = 0 ; i < nr ; i++){
            for(int j = 0 ; j < nc ; j++){
                cost[i][j] = scn.nextInt();
            }
        }
        for(int i = 0; i < nr; i++) System.out.println(Arrays.toString(cost[i]));
        Gold(nr, nc, cost);
    }
    public static void Gold(int nr , int nc , int cost[][]){
        int dp[][] = new int[nr][nc];
        for(int c = 0 ; c < nc ; c++){
            for(int r = 0 ; r < nr ; r++){
                if(c==0){
                    dp[r][c] = cost[r][c];
                }
                else if(r == 0){
                    dp[r][c] = Math.max(dp[r][c - 1],dp[r+1][c - 1])+cost[r][c];
                }
                else if(r== nr-1){
                    dp[r][c] = Math.max(dp[r][c - 1],dp[r-1][c - 1])+cost[r][c];
                }
                else{
                    dp[r][c] = Math.max(dp[r][c - 1],Math.max(dp[r+1][c - 1], dp[r-1][c - 1]))+cost[r][c];
                }
            }
        }
        for(int r = 0; r < nr; r++) System.out.println(Arrays.toString(dp[r]));
        int Max = Integer.MIN_VALUE;
        for(int row = 0 ; row < nc ; row++){
            if(dp[row][nc-1] > Max){
                Max = dp[row][nc-1];
            }
        }
        System.out.println(Max);
    }
}
