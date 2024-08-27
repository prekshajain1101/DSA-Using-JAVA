package DynamicProgramming;

import java.util.Scanner;


public class climbstairswithvariablejump {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i <n ; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(VariableJump(n, arr));
        System.out.println(VariableJumpTO(n, arr));
    }
    public static int VariableJump(int n , int arr[]){
        int dp[] = new int[n+1];
        dp[n] = 1;
        for(int i = n-1 ; i>=0 ; i--){
            if(arr[i] == 0){
                continue;
            }
            for(int j = 1 ; j<= arr[i] && i+j <=n ; j++){
                dp[i] += dp[i+j];
            }
        }
        return dp[0];
    }
    //Sliding Window
    public static int VariableJumpTO(int n , int arr[]){
        for(int i = n-1 ; i >= 0 ; i++){
            if(arr[i] == 0){
                continue;
            }
            else{
                int tways = 0;
                for(int j = 1 ; j <= arr[i] && i+j <=n ;j++){
                    tways += i+j == n ?1 : arr[i+j]; 
                }
                arr[i] = tways;
            }
        }
        return 0 ;
    }
}