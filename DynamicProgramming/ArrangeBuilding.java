package DynamicProgramming;

import java.util.Scanner;

public class ArrangeBuilding {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        if(n == 0 || n == 1){
            System.out.println(n + 1);
            return;
        }  
        long OSEW0 = 1 ; 
        long OSEW1 = 1;
        long path = 0;
        for(long i = 2 ; i <= n ; i++){
            long NSEW0 = OSEW1;
            long NSEW1 = OSEW0 + OSEW1;
            OSEW0 = NSEW0;
            OSEW1 = NSEW1;
            path = OSEW0 + OSEW1;
        }
        System.out.println(path * path);
    }
}
