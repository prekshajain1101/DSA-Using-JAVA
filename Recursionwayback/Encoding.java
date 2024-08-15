package Recursionwayback;

import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printEncoding(str, " ");

    }
    public static void printEncoding(String str , String enc){
        if(str.length()==0){
            System.out.println(enc);
            return;
        }
        if(str.charAt(0) == '0'){
            return;
        }
        //single digit num
        char firstchar = str.charAt(0);
        int num1 = firstchar - '0';
        printEncoding(str.substring(1), enc+(char)('a'+num1 -1));
        if(str.length() > 1){
            //second digit number
            char secondchar = str.charAt(1);
            int num2 = (firstchar - '0') * 10 + (secondchar - '0');
            if(num2 >= 10 && num2 <= 26){
                printEncoding(str.substring(2), enc+(char)('a'+num2-1));
            }
        }
    }
}
