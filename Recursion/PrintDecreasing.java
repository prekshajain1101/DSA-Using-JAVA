package Recursion;
import java.util.*;
public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        getDecreasing(n);
    }
    public static void getDecreasing(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        getDecreasing(n-1);
    }
}
