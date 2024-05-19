package mile3;
import java.util.*;
class place {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input1 = new int[size];
        for (int i = 0; i < size; i++) {
            input1[i] = sc.nextInt();
        }
        char[] res = mile3(input1,size);
        for(int i=0;i<res.length;i++) {
            System.out.print(res[i]);
        }
    }

    static char[] mile3(int[] input1, int size) {
        int[] sortedInput = input1.clone();

        for (int i = 0; i < size; i++) {
            System.out.println(sortedInput[i]);
        }
        Arrays.sort(sortedInput);
        char[] output = new char[input1.length];
        for (int i = 0; i < input1.length; i++) {
            int index = Arrays.binarySearch(sortedInput, input1[i]);
            output[i] = (char) ('a' + index);
        }
        return output;
    }
}