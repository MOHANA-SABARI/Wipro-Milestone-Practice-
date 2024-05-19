package mile3;
import java.util.*;
public class toggle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = sc.nextInt();
        System.out.println(toog(s,x));
    }

    static String toog(String n,int x){
        String rev = "";
        if(x==0){
            for(int i=0;i<n.length();i++){
                if(i%2==0)
                    rev+=n.charAt(i);
            }
        }
        else if(x==1){
            for(int i=0;i<n.length();i++){
                if(i%2==1)
                    rev+=n.charAt(i);
            }
        }
        else{
            char [] cc = n.toCharArray();
            String ff = "";
            for(char i : cc){
                ff+=i;
            }
            StringBuilder d = new StringBuilder(ff.toString());
            rev = d.reverse().toString();
        }
        String result = "";
        char arr8[] = rev.toCharArray();
        for (char i : arr8) {
            if (Character.isUpperCase(i))
                result += Character.toLowerCase(i);
            else if (Character.isLowerCase(i))
                result += Character.toUpperCase(i);
            else result += i;
        }
        return result;
    }
}
