package Recursionwayback;

import java.util.Scanner;

public class printkpc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printkpc(str, " ");
    }
    public static String keypad[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printkpc(String str , String asf){
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0);
        String rof = str.substring(1);
        String word = keypad[Integer.parseInt(ch+"")];
        for(int i = 0 ; i < word.length() ; i++){
            printkpc(rof, asf+word.charAt(i));
        }
    }
}
