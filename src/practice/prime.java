package practice;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int count = 0;

        int x = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (isprime(arr[i])) {
                if (arr[i] < x) {
                    x = arr[i];
                }
                count += arr[i];
            }
        }
        if(count==0){
            for(int i=0;i< arr.length;i++){
                if(arr[i]<x){
                    x=arr[i];
                }
                count+=arr[i];
            }
            System.out.println(count - x);
        }else{
            System.out.println(count - x);
        }
    }
    static boolean isprime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
            }
            return true;
    }
}
