package DynamicProgramming;

import java.util.Scanner;

public class painthouse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][3];
        for(int i = 0 ; i < n ; i++){
            arr[i][0] = scn.nextInt();
            arr[i][1] = scn.nextInt();
            arr[i][2] = scn.nextInt();
        }
        int oCostRed = arr[0][0] , oCostBlue = arr[0][1] , oCostGreen = arr[0][2];
        for(int i = 1 ; i < n ; i++){
            int nCostRed = arr[i][0] + Math.min(oCostRed , oCostBlue);
            int nCostBlue = arr[i][1] + Math.min(oCostRed , oCostGreen);
            int nCostGreen = arr[i][2] + Math.min(oCostRed , oCostBlue);
            oCostRed = nCostRed;
            oCostBlue = nCostBlue;
            oCostGreen = nCostGreen;
        }
        int minCost = Math.min(oCostRed , Math.min(oCostBlue , oCostGreen));
        System.out.println(minCost);
    }
}
