package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> list = gss(str);
        System.out.println(list);
    }
    public static ArrayList<String> gss(String str){
        if(str.length() == 0){
            ArrayList<String> blist = new ArrayList<>();
            blist.add("");
            return blist;
        }
        char ch = str.charAt(0);
        String roq = str.substring(1);
        ArrayList<String> subsequence = gss(roq);
        ArrayList<String> mysubseq = new ArrayList<>();
        for(String s : subsequence){
            mysubseq.add(s);
        }
        for(String s : subsequence){
            mysubseq.add(ch+s);
        }
        return mysubseq;
    }
}
