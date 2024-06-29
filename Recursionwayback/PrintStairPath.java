package Recursionwayback;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintStairPath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printStairpath(n , " ");
    }
    public static void printStairpath(int n , String asf ){
        if(n==0){
            System.out.println(asf);
            return;
        }
        if(n-1 >= 0){
            printStairpath(n-1, asf+"1");
        }
        if(n-2 >= 0){
            printStairpath(n-2, asf+"2");
        }
        if(n-3 >= 0){
            printStairpath(n-3, asf+"3");
        }
    }
}

