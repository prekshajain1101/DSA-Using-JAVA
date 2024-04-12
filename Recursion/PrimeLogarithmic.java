package Recursion;
import java.util.*;
public class PrimeLogarithmic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        System.out.println(getPrimeLogarithmic(x, n));
    }
    public static int getPrimeLogarithmic(int x , int n){
        if( n == 0){
            return 1 ;
        }
        int y = getPrimeLogarithmic(x, n/2);
        int z = y * y;
        if(n % 2 == 1){
            z = z * x;
        }
        return z ;
    }
}
