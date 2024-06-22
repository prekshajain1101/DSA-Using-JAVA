package mean;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(getfactorial(n));
    }
    public static int getfactorial(int n){
        if(n == 0){
            return 1 ;
        }
        int f = n * getfactorial(n-1);
        return f ;
    }
}
