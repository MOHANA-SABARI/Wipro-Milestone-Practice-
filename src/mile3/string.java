package mile3;
import java.util.*;
public class string {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        System.out.println(stringdecoder(x));
    }
    static String stringdecoder(String s){
        String ans="";
        for(String k:s.split("1"))
            ans+=(char)(k.length()+64);
        return ans;
    }
}