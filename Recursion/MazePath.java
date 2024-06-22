package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        ArrayList<String> Path = getMazePath(0, 0, nr-1, nc-1);
        System.out.println(Path);
    }
    public static ArrayList<String> getMazePath(int sr , int sc , int dr , int dc){
        if(sr== dr && sc== dc){
            ArrayList<String> blist = new ArrayList<>();
            blist.add("");
            return blist;
        }
        ArrayList<String> mypath = new ArrayList<>();
        if(sc+1 <= dc){
            ArrayList<String> hpath = getMazePath(sr, sc+1, dr, dc);
            for(String Path : hpath){
                mypath.add("h"+Path);
            }
        }
        if(sr+1 <= dr){
            ArrayList<String> vpath = getMazePath(sr+1, sc, dr, dc);
            for(String Path : vpath){
                mypath.add("v"+Path);
            }
        }
        return mypath;
    }
}
