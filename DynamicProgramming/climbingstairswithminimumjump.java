package DynamicProgramming;

public class climbingstairswithminimumjump {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {3,3,0,2,1,2,4,2,0,0};
        System.out.println(Minimumjump(n, arr));
    }
    public static int Minimumjump(int n , int arr[]){
        int dp[] = new int[n+1];
        dp[n] = 0;
        for(int i = n-1 ; i >=0 ; i--){
            if(arr[i] == 0){
                dp[i] = Integer.MAX_VALUE;
            }
            int min = Integer.MAX_VALUE;
            int tways = 0;
            for(int j = 1 ; j<=arr[i] && i+j <=n; j++){
                if(dp[i+j] < min){
                    min = dp[i+j];
                }
            }
            tways = (min != Integer.MAX_VALUE) ? min+1 : min;
            dp[i] = tways;
        }
        return dp[0];
    }
}
