package Recursion;
import java.util.*;
public class FibbonaciSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        getFibbonaciSeries(n , 0 , 1);

    }
    public static void getFibbonaciSeries(int n , int a , int b){
        if(n == 0){
            return;
        }
        System.out.print(a + " ");
        int c = a + b;
        a = b;
        b = c;
        getFibbonaciSeries(n-1, a, b);
    }
}
