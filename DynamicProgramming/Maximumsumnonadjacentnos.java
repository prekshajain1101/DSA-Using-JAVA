package DynamicProgramming;

import java.util.Scanner;

public class Maximumsumnonadjacentnos {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int [n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        int oInc = 0 , oExc = 0;
        for(int i = 0 ; i < n ; i++){
            if(i == 0){
                oInc = 0;
            }
            else{
                int nInc = arr[i] + oExc;
                int nExc = Math.max(oInc , oExc);
                oInc = nInc;
                oExc = nExc;
            }
        }
        System.out.println(Math.max(oInc , oExc));
    }
}
