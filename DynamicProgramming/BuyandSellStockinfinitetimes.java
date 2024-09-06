package DynamicProgramming;

import java.util.Scanner;

public class BuyandSellStockinfinitetimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(InfiniteTransaction(arr, n));
    }
    public static int InfiniteTransaction(int arr[] , int n){
        int bp = 0 , sp = 0 , profit = 0;
        for(int i = 1 ; i < n ; i++){
            if(arr[i] > arr[i-1]){
                sp = i;
            }
            else{
                profit += arr[sp] - arr[bp];
                sp = bp = i;
            }
        }
        profit+= arr[sp] - arr[bp];
        return profit;
    }
}
