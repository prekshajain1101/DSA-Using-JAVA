package Recursionwayback;

import java.util.Scanner;

public class mazepathswithjmp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        printpaths(0, 0, nr-1, nc-1, " ");
    }
    public static void printpaths(int sr , int sc , int dr , int dc , String psf){
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        for(int jmp = 1 ; sc+jmp <= dc ; jmp++){
            printpaths(sr, sc+jmp, dr, dc, psf+"h"+jmp);
        }
        for(int jmp = 1 ; sr+jmp <= dr ; jmp++){
            printpaths(sr+jmp, sc, dr, dc, psf+"v"+jmp);
        }
        for(int jmp = 1 ; sr+jmp <= dr && sc+jmp <= dc; jmp++){
            printpaths(sr+1, sc+1, dr, dc, psf+"d"+jmp);
        }
    }
}
