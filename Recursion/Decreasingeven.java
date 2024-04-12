package Recursion;
import java.util.*;
public class Decreasingeven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        getDecreasingEven(n);
    }
    public static void getDecreasingEven(int n){
        if( n < 0){
            return;
        }
        if( n % 2 != 0){
            getDecreasingEven(n-1);
        }
        else{
            System.out.println(n);
            getDecreasingEven(n-2);
        }
    }
}
