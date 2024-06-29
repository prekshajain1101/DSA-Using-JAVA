package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Kpc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        ArrayList<String> res = getKpc(exp);
        System.out.println(res);
    }
    public static String keypad[] ={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKpc(String str){
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add(" ");
            return base;
        }
        String roq = str.substring(1);
        ArrayList<String> rres = getKpc(roq);
        String word = keypad[Integer.parseInt(str.charAt(0)+"")];
        ArrayList<String> list = new ArrayList<>();
        for(int idx = 0 ; idx < word.length() ; idx++){
            for(String comb:rres){
                list.add(word.charAt(idx)+comb);
            }
        }
        return list;
    }
}
