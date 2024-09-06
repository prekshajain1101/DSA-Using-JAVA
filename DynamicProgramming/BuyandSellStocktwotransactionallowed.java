package DynamicProgramming;

import java.util.Scanner;

public class BuyandSellStocktwotransactionallowed {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(Twotransactionallowed(arr, n));
    }
    public static int Twotransactionallowed(int arr[] , int n){
        int pBD[] = profitConsideringbuyingday(arr, n);
        int pSD[] = profitConsideringSellingday(arr, n);
        for(int i = n-2 ; i >= 0 ; i--){
            pBD[i] = Math.max(pBD[i],pBD[i+1]);
        }
        for(int i = 1 ; i < n ; i++){
            pSD[i] = Math.max(pSD[i],pSD[i-1]);
        }
        int omax = 0;
        for(int i = 0 ; i < n ; i++){
            omax = Math.max(omax , pBD[i]+pSD[i]);
        }
        return omax;
    }
    public static int[] profitConsideringbuyingday(int arr[] , int n){
        int res[] = new int[n];
        int bestSell = arr[n-1];
        for(int i = n-2 ; i >=0 ; i--){
            if(arr[i] > bestSell){
                bestSell = arr[i];
            }
            else{
                res[i] = bestSell-arr[i];
            }
        }
        return res;
    }
    public static int[] profitConsideringSellingday(int arr[] , int n){
        int res[] = new int[n];
        int bestBuy = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i] < bestBuy){
                bestBuy = arr[i];
            }
            else{
                res[i] = arr[i] - bestBuy;
            }
        }
        return res;
    }
}
