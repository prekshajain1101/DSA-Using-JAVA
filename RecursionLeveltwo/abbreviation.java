package RecursionLeveltwo;

import java.util.Scanner;

public class abbreviation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str, "", 0, 0);
    }
    public static void solution(String str , String asf , int count , int pos){
        if(pos == str.length()){
            if(count != 0){
                System.out.println(asf+count);
            }
            else{
                System.out.println(asf);
            }
            return;
        }
        char ch = str.charAt(pos);
        if(count == 0){
            solution(str, asf+ch, 0, pos+1);
        }
        else{
            solution(str, asf+count+ch, 0, pos+1);
        }
        solution(str, asf, count+1, pos+1);
    }
}
