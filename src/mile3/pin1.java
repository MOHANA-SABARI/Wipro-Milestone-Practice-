package mile3;
import java.util.*;
public class pin1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f = sc.nextLine();
        String l = sc.nextLine();
        int pin = sc.nextInt();
        int num = sc.nextInt();
        System.out.println(User_id(f, l, pin, num));
    }
    static String User_id(String f, String l, int pin, int num) {
        String res="";
        if (f.length() == l.length()) {
            HashSet<String> x = new HashSet<>();
            x.add(f);
            x.add(l);
            System.out.println(x);
            String[] arr = x.toArray(new String[x.size()]);
            System.out.println(arr[0] + "" + arr[1]);
            char a = arr[1].charAt(arr[1].length()-1);
            String j = Integer.toString(pin);
            String[] dd = j.split("");
            res = a + arr[0] + dd[num - 1] + dd[dd.length - num];
        } else {
            String[] arr1 = {f, l};
            System.out.println(arr1[0] + "" + arr1[1]);
            if (arr1[0].length() < arr1[1].length()) {
                char a = arr1[0].charAt(arr1[0].length()-1);
               // char a = arr1[1].charAt(arr1[1].length()-1);
                String j = Integer.toString(pin);
                String[] dd = j.split("");
                res = a + arr1[1] + dd[num - 1]+ dd[dd.length - num] ;
            } else {
                char a = arr1[1].charAt(arr1[1].length()-1);//
               // char a = arr1[0].charAt(arr1[0].length()-1);
                String j = Integer.toString(pin);
                String[] dd = j.split("");
                res = a + arr1[0] + dd[num - 1]+ dd[dd.length - num] ;
            }
        }
        System.out.println(res);
        String result = "";
        char arr8[] = res.toCharArray();
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
