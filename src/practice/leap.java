package practice;
import java.util.*;
public class leap {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

       // int year = sc.nextInt();
      //  int age = sc.nextInt();
        String s = sc.next();
        String gender = sc.next();
        int m = sc.nextInt();

      /*  if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Non-Leap Year");
        }

        if(age>18){
            System.out.println("Eligible for Vote");
        }*/

        if (s.equals("married")) {
            System.out.println("kalyanam Achuuuu...!");
        }
        if(s.equals("unmarried")) {
            if(gender.equals("male") && m>30){
                System.out.println(s+" "+gender+" "+m);
            } if(gender.equals("female") && m>25){
                System.out.println(s+" "+gender+" "+m);
            }
        }

    }
}
