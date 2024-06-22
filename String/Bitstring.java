package String;
public class Bitstring {
    public static void main(String[] args) {
        String bString = "1000100011";
        int index = 4;
        int index1 = 6;
        System.out.println(bitString(bString, index));
        System.out.println(flipString(bString));
        System.out.println(bitString(bString , index1));
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
