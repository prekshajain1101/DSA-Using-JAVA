package Recursion;
import java.util.*;
public class PrimeLinear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        System.out.println(getPrimeLinear(n, x));
    }
    public static int getPrimeLinear(int n , int x){
        if( n == 0){
            return 1;
        }
        int pm = getPrimeLinear(n-1, x);
        int Primel = pm * x;
        return Primel;
    }
}