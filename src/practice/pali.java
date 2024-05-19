package practice;
import java.util.*;
public class pali {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String d = sc.nextLine();
            String [] arr = d.split("");
            StringBuilder f = new StringBuilder(d);
            String h = f.reverse().toString();

            if(d.equals(h)){
                System.out.println("0");
            }else{
                HashSet<String> x = new HashSet<>();

                for(int i=0;i<d.length();i++){
                    x.add(arr[i]);
                }
                System.out.println(x);
            }

        }
    }


