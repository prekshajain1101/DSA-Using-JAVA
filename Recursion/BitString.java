package Recursion;

import java.util.ArrayList;

public class BitString {
    public static void main(String[] args) {
        String bString = "1000100011";
        // int index = 4;
        // int index1 = 6;
        ArrayList<Integer> res = new ArrayList<>();
        String req[] = {"count:4" , "flip" , "count:6" };
        for(String str : req){
            if(str.contains(":")){
                String[] func = str.split(":");
                int indx = Integer.parseInt(func[1]);
                res.add(bitString(bString, indx));
            }
            else{
                bString = flipString(bString);
            }
        }
        System.out.println(res);
        // System.out.println(bitString(bString, index));
        // System.out.println(bitString(bString, index1));
        // System.out.println(flipString(bString));
        // System.out.println("123");
    }
    public static int bitString(String bString , int index){
        int count = 0;
        if (index >= 0 && index < bString.length()) {
            for (int i = 0; i <= index; i++) {
                if (bString.charAt(i) == '1') {
                    count++;
                }
            }
        }
        return count;
    }
    public static String flipString(String bString){
        char[] charArray = bString.toCharArray();
        for(int i = 0 ; i < charArray.length ; i++){
            if(charArray[i] == '0'){
                charArray[i] = '1';
            }
            else if(charArray[i]=='1'){
                charArray[i] = '0';
            }
        }
        return new String(charArray);
    }
}
