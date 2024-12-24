
import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=12;
        arr[1]=98;
        arr[2]=54;
        arr[3]=73;
        arr[4]=6;
        for(int num : arr){
            System.out.println(num);
            System.out.println(Arrays.toString(arr)); // this will print all the elements 5 times
        }
    }
}
