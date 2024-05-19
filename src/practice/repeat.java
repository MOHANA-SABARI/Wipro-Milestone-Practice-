package practice;
import java.util.*;
public class repeat {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> x = new HashMap<Integer,Integer>();

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>0){
                if(x.containsKey(arr[i])){
                    System.out.println(arr[i]);
                }
                x.put(arr[i],1);
            }
        }
        if(x.isEmpty()){System.out.println(0);}
        System.out.println(arr[arr.length-1]);
    }
}
