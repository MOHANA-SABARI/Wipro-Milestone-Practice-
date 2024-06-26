package mile3;
import java.util.*;
public class formula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findAns(str));
    }
    public static int findAns(String input1){
        List<Integer> num=new LinkedList<>();
        List<Character> opt=new LinkedList<>();
        for (int i = 0; i < input1.length(); i++) {
            char c=input1.charAt(i);
            if (Character.isDigit(c)) {
                num.add((c-48));
            }
            if(c=='+'||c=='-'||c=='/'||c=='*'){
                opt.add(c);
            }
        }
        int a=num.get(0),b=0;
        for (int i = 0; i < opt.size(); i++) {
            b=num.get(i+1);
            char op=opt.get(i);
            switch (op) {
                case '+':
                    a+=b;
                    break;
                case '-':
                    a-=b;
                    break;
                case '/':
                    a/=b;
                    break;
                case '*':
                    a*=b;
                    break;
                default:
                    break;
            }
        }
        return a;
    }
}