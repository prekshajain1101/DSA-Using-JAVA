package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Stairpath {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        ArrayList<String> path = getStairPath(n);
        System.out.println(path);
    }
    public static ArrayList<String> getStairPath(int n){
        if(n == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if(n < 0){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        ArrayList<String> mypath = new ArrayList<>();
        ArrayList<String> get1len = getStairPath(n-1);
        for(String path : get1len){
            mypath.add("1"+path);
        }
        ArrayList<String> get2len = getStairPath(n-2);
        for(String path : get2len){
            mypath.add("2"+path);
        }
        ArrayList<String> get3len = getStairPath(n-3);
        for(String path : get3len){
            mypath.add("3"+path);
        }
        return mypath;
    }
}
