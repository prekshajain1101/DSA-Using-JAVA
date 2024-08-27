package RecursionLeveltwo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boxeschooses {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int rboxes = Integer.parseInt(br.readLine());
        combination(1, nboxes, 0, rboxes, "");
    }
    public static void combination(int cb , int tb , int ssf , int ts , String asf){
        if(cb > tb){
            if(ssf == ts){
                System.out.println(asf);
            }
            return;
        }
        combination(cb+1, tb, ssf+1, ts, asf+"i");
        combination(cb+1, tb, ssf, ts, asf+"-");
    }
}
