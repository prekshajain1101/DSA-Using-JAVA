package Recursion;
import java.util.*;
public class Increasingodd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        getSolution(n);
    }
    public static void getSolution(int n){
        if( n <= 0){
            return;
        }
        if(n % 2 == 0){
            getSolution(n-1);
        }
        else{
            getSolution(n-2);
            System.out.println(n);
        }
    }
}

