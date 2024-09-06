package DynamicProgramming;

import java.util.Scanner;

public class BuyandSellStockInfiniteTransactionwithfee {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        int fee = scn.nextInt();
        System.out.println(InfiniteTransactionwithfee(arr, n, fee));
    }
    public static int InfiniteTransactionwithfee(int arr[] , int n , int fee){
        int OBSP = - arr[0] , OSSP = 0;
        for(int i = 1 ; i < n ; i++){
            int nBSP = Math.max(OBSP , OSSP -arr[i]);
            int nSSP = Math.max(OSSP , arr[i]-fee+OBSP);
            OBSP = nBSP;
            OSSP = nSSP;
        }
        return OSSP;
    }
}
