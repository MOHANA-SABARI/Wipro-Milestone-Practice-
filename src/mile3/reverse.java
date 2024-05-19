package mile3;
import java.util.*;
public class reverse {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int num = sc.nextInt();
        System.out.println(find_rev(n,num));
    }

    static String find_rev(String n,int num){
        String [] arr = n.split(" ");
        //String[] res = new String[arr.length];
        String j = "";String h ="";boolean check = true;
       // char [] dd = n.toCharArray();// res+=" ";
            for (int i = 0; i < arr.length; i++) {
                StringBuilder x = new StringBuilder(arr[i].toString());
                x.reverse();
                if(check){
                h+= String.valueOf(x);
                check=false;}
                else{
                    h+= " "+String.valueOf(x);
                }
            }

        if(num==1){
            String temp =h.toLowerCase();
            h="";
            for(int i=0;i<temp.length();i++){
                char co = n.charAt(i);
                char cr = temp.charAt(i);
                if(Character.isUpperCase(co)  || n.charAt(i)==',' ){
                    h+=Character.toUpperCase(cr);
                }else{
                    h+=temp.charAt(i);
                }
            }
        }
        return h;
    }
}
