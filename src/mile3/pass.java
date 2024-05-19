package mile3;
import java.util.*;
public class pass {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(pass2(arr,size));
    }

    public static int pass2(int input1[],int input2){
        Arrays.sort(input1);
        ArrayList<Integer> l = new ArrayList<>();
        for(int x:input1)l.add(x);
        int a=1,b=1;
        int max=0;
        for(int x:l){
            int f = Collections.frequency(l,x);
            if(f>=max){max=f;a=x;}
        }
        max=0;
        for(int x:l){
            int f = Collections.frequency(l,x);
            if(f>=max && x!=a){max=f;b=x;}
        }
        return Integer.parseInt(""+b+a);
    }
}
