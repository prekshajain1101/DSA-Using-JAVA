package RecursionLeveltwo;

import java.util.Scanner;

public class maximumafterkswaps {
    static String max;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
        max = str;
        findMaximum(str , k);
        System.out.println(max);
    }
    public static String swap(String str , int i , int j){
        StringBuilder sb = new StringBuilder(str);
        char ich = sb.charAt(i);
        char jch = sb.charAt(j);
        sb.setCharAt(i,jch);
        sb.setCharAt(j,ich);
        return sb.toString();
    }
    public static void findMaximum(String str , int k){
        if(k==0){
            return;
        }
        for(int i = 0 ; i < str.length() ; i++){
            for(int j = i+1 ; j < str.length() ; j++){
                String nstr = swap(str, i, j);
                if(Integer.parseInt(nstr) > Integer.parseInt(max)){
                    max = nstr;
                }
                findMaximum(nstr, k-1);
            }
        }
    }
}
