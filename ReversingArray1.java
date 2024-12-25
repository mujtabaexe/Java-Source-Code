
import java.util.Arrays;



public class ReversingArray1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] temp = new int[5];
        for(int i=arr.length-1;i>=0;i--){
            temp[4-i]=arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
    