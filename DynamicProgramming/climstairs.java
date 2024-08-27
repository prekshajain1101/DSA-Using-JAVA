package DynamicProgramming;
import java.util.*;
public class climstairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ways = ClimbStairsT(n);
        System.out.println(ways);
    }
    //memoization
    // public static int ClimbStairs(int n , int dp[]){
    //     if(n==0){
    //         return dp[n] = 1;
    //     }
    //     if(dp[n] != 0){
    //         return dp[n];
    //     }
    //     int tways = 0;
    //     if(n-1 >= 0){
    //         tways += ClimbStairs(n-1, dp);
    //     }
    //     if(n-2 >= 0){
    //         tways += ClimbStairs(n-2, dp);
    //     }
    //     if(n-3 >= 0){
    //         tways += ClimbStairs(n-3, dp);
    //     }
    //     return dp[n]=tways;
    // }
    public static int ClimbStairsT(int n ){
        int dp[] = new int[n+1];
        for(int i = 0 ; i <= n ; i++){
            if(i == 0){
                dp[0] = 1;
            }
            else if(i == 1){
                dp[i] += dp[i-1];
            }
            else if(i == 2){
                dp[i] = dp[i-1]+ dp[i-2];
            }
            else{
                dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
        return dp[n];
    }
}
