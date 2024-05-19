package practice;
import java.util.*;
public class arr {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        int [] arr1 = new int[size];
        HashSet<Integer> x = new HashSet<Integer>();
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            x.add(arr[i]);
        }
       // int siz = sc.nextInt();
       // int s = sc.nextInt();

       //for(int i=0;i<size;i++){
          //  if(i==siz){
                x.add(500);
                //continue;
          //  }
     //   }//

      //  for(int i:x){
            System.out.print(x);
      //  }

    }
}
