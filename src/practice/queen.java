package practice;
import java.util.*;
public class queen {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [][] = new int[size][size];
        boolean check=true;
        boolean check2=true;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j){arr[i][j]=1;}}
        }
        System.out.print("[[");
        for(int i=0;i<size;i++){
            check=true;
            System.out.print("[");
            for(int j=0;j<size;j++){
                if(check){System.out.print(arr[i][j]);check=false;}
                else{System.out.print(","+arr[i][j]);}
            }
            System.out.print("],");
        }
        System.out.print("],[");
        for(int i=size-1;i>=0;i--){
            System.out.print("[");
            check2=true;
            for(int j=size-1;j>=0;j--){
                if(check2){System.out.print(arr[i][j]);check2=false;}
                else{
                    System.out.print(","+arr[i][j]);
                }//System.out.print("]");
            }
            System.out.print("],");
        }
        System.out.print("]]");
    }
}