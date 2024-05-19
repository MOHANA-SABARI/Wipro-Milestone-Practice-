package practice;
import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.contains(b));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.contains(b));
        System.out.println(a.isEmpty());
        System.out.println(a.startsWith("M"));
        System.out.println(a.endsWith("i"));
        System.out.println(a.substring(4));
        System.out.println(a.substring(5,10));
        System.out.println(a.trim());
    }
}
