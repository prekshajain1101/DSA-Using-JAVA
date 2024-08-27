package RecursionLeveltwo;

import java.util.Scanner;

public class Lexographic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1 ; i<= 9 ; i++){
            solve(i, n);
        }
    }
    public static void solve(int num , int n){
        if(num > n){
            return;
        }
        System.out.println(num);
        for(int i = 0 ; i<= 9 ; i++){
            int Newnum = (num*10)+i;
            if(Newnum <= n){
                solve(Newnum, n);
            }
        }
    }
}
