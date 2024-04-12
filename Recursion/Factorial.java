package Recursion;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(getFactorial(n));
    }
    public static int getFactorial(int n){
        if(n == 0){
            return 1;
        }
        int res = n * getFactorial(n-1);
        return res;
    }
}
