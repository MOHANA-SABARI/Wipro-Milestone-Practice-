package practice;
import java.util.*;
public class finger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 100: ");
        int num = scanner.nextInt();
        String finger = getFinger(num);
        System.out.println("The finger is: " + finger);
    }

    public static String getFinger(int num) {
        String[] fingers = {"","Little", "Ring", "Middle", "Index", "Thumb"};
        int index = (num - 1) % 8;
        if(index==0){return fingers[2];}
        else if (index < 5) {
            return fingers[index];
        } else {
            return fingers[10- index];
        }
    }
}
