package DynamicProgramming;

import java.util.Scanner;

public class BinaryStringcount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int OSEW0 = 1;
        int OSEW1 = 1;
        for(int i = 2 ; i <= n ; i++){
            int NSEW0 = OSEW1;
            int NSEW1 = OSEW0 + OSEW1;
            OSEW0 = NSEW0;
            OSEW1 = NSEW1;
        }
        System.out.println(OSEW0 + OSEW1);
    }
}
