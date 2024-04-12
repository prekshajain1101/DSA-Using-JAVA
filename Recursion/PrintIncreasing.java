package Recursion;
import java.util.*;
public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        getIncreasing(n);
    }
    public static void getIncreasing(int n){
        if( n == 0 ){
            return;
        }
        getIncreasing( n-1);
        System.out.println(n);
    }
}
