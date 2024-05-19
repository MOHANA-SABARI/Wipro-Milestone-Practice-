package practice;
import java.util.*;
class vanakam{
    int name ;
    int nee ;
    static int nan;

    public void shoe(){
        System.out.println(name+" : "+nee+" : "+nan);
    }
}
public class Main {
    public static void main(String [] args){
            vanakam d = new vanakam();
            Scanner sc = new Scanner(System.in);

             d.name = sc.nextInt();
            d.nan = sc.nextInt();
            d.nee = sc.nextInt();
            vanakam.nan = sc.nextInt();

            d.shoe();

            int x =4;
            x = x<<1;
            int y = 4>>1;
            int a =10;
            int b=20;
            System.out.println(x+y);

            boolean check;
            check = a>b;
        System.out.println(check);
        switch (a){
            case 10:
                System.out.println((int)Math.pow(a,a));
                break;
            case 12:
                System.out.println(a*a);
                break;
            default:
                System.out.println("mistake");
                break;
        }
    }
}
