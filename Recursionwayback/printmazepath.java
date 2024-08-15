package Recursionwayback;

import java.util.Scanner;

public class printmazepath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        printmaze(0, 0, nr-1, nc-1, " ");
    }
    public static void printmaze(int sr , int sc , int dr , int dc , String psf){
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }
        if(sr>dr || sc > dc){
            return;
        }
        printmaze(sr, sc+1, dr, dc, psf+"V");
        printmaze(sr+1, sc, dr, dc, psf+"H");
    }
}
