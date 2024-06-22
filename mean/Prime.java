package mean;

import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean Flag = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                Flag = false;
                break;
            }
        }
        if (Flag) {
            System.out.println(" A Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
