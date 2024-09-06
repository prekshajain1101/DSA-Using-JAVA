package DynamicProgramming;

import java.util.Scanner;

public class BuyandSellstockusingcooldown {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(Cooldown(arr, n));
    }
    public static int Cooldown(int arr[], int n){
        int OBSP = -arr[0] , OSSP = 0 , OCSP = 0;
        for(int i = 1 ; i < n ; i++){
            int nBSP = Math.max(OBSP , OCSP-arr[i]);
            int nSSP = Math.max(OSSP , arr[i]+OBSP);
            int nCSP = OSSP;
            OSSP = nSSP;
            OBSP = nBSP;
            OCSP = nCSP;
        }
        return OSSP;
    }
}
