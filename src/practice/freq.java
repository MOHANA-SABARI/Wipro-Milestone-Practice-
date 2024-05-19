package practice;
import java.util.*;
public class freq {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] input1 = new int[size];

        for(int i=0;i<size;i++){
            input1[i]=sc.nextInt();
        }
        StringBuilder h = new StringBuilder();
        for(int i: input1){
            h.append(i);
        }
        int [] arr = new int[10];
        for(int i=0;i<input1.length;i++){
            while(input1[i]>0){
                int rem = input1[i]%10;
                arr[rem]++;
                input1[i]/=10;
            }
        }
        int maxFreqIndex = 0;
        int maxFreq = 0;
        int minFreqIndex = 0;
        int minFreq = 9;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=maxFreq) {
                maxFreqIndex = i;
                maxFreq = arr[i];
            }
            if (arr[i]>0) {
                if(minFreq>arr[i]) {
                    minFreqIndex = i;
                    minFreq = arr[i];
                }
            }
        }
        String back = h.toString();
        char [] r = back.toCharArray();
        Arrays.sort(r);
        String s = "";
        s+=maxFreqIndex;
        s+=minFreqIndex;
        s+=r[r.length-1];
        s+=r[0];
        System.out.println(s);
}
}

