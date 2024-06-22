package Recursion;
import java.util.*;
public class Printzigzag {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pzz(n);
    }
    public static void pzz(int n){
        if(n == 1){
            System.out.print("111");
            return;
        }
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);
    }
}
