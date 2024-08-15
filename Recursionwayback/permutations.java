package Recursionwayback;

import java.util.Scanner;

public class permutations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printpermuatations(str, " ");
    }
    public static void printpermuatations(String str , String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i < str.length(); i++){
            char firstchar = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i+1);
            printpermuatations(remaining, ans+firstchar);
        }
    }
}
