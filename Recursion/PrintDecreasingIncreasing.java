package Recursion;
import java.util.*;
public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        getDecreasingIncreasing(n);
    }
    public static void getDecreasingIncreasing(int n){
        if( n == 0){
            return;
        }
        System.out.println(n);
        getDecreasingIncreasing(n-1);
        System.out.println(n);
    }
}
