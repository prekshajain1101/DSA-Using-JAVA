package Recursionwayback;

import java.util.Scanner;

public class Printsubsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        printSS(exp, " ");
    }
    public static void printSS(String ques, String asf){
        if(ques.length()==0){
            System.out.println(asf);
        return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        printSS(roq, asf+ch);
        printSS(roq, asf);
    }
}
