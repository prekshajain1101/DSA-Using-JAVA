package Recursion;
import java.util.*;
public class TowerofHanoi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int src = scn.nextInt();
        int dest = scn.nextInt();
        int helper = scn.nextInt();
        toh(src, dest, helper, n);
    }
    public static void toh(int src , int dest , int helper , int n){
        if(n == 0){
            return;
        }
        toh(src, helper , dest , n-1);
        System.out.print(n+"["+src+"->"+dest+"]");
        toh(helper,dest,src,n-1);
    }
}
