package practice;
import java.util.*;
public class code {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();

        int [] arr = {(input1/1000),(input1/100)%10,(input1/10)%10,(input1%10)};
        int [] arr1 = {(input2/1000),(input2/100)%10,(input2/10)%10,(input2%10)};
        int [] arr2 = {(input3/1000),(input3/100)%10,(input3/10)%10,(input3%10)};
        int even =arr[2]+arr[0]+arr1[2]+arr1[0]+arr2[2]+arr2[0];
        int odd =arr[1]+arr[3]+arr1[1]+arr1[3]+arr2[1]+arr2[3];
        if(input4%2==0){
            System.out.println(even-odd);
        }
        else{
           // odd = ;
           System.out.println(odd-even);
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println((arr[0]*arr[3])*(arr1[0]*arr1[3])*(arr2[0]*arr2[3])-input4);
    }
}