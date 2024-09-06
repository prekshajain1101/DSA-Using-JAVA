package DynamicProgramming;

import java.util.Scanner;

public class BuyandSellonetransactionallowed {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int price[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            price[i] = scn.nextInt();
        }
        System.out.println(onetransaction(price, n));
    }
    public static int onetransaction(int price[] , int n){
        int Bestbuy = price[0] , maxProfit = 0;
        for(int i = 0 ; i < n ; i++){
            if(price[i] < Bestbuy){
                Bestbuy = price[i];
            }
            else{
                if(price[i] - Bestbuy > maxProfit){
                    maxProfit = price[i] - Bestbuy;
                }
            }
        }
        return maxProfit;
    }
}
