
import java.util.Arrays;


public class Shuffle {

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry"};
        int k = 3;
        if (k > arr.length) {

        } else {
            int temp = arr.length;
            change(arr, k, temp);
        }
    }

    public static void change(String[] arr, int k, int temp) {
        if (k == arr.length) {
            String[] arr2 = new String[arr.length];
            for (int i = k-1; i >=0; i--) {
                // System.out.println(arr[i]);
                for (int j = 0; j <arr.length; j++) {
                arr2[j]=arr[i];
                // arr2[j]=arr[i];
                }
                
            }
            System.out.println(Arrays.toString(arr2));
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (k <= temp) {
                    for (int j = k; j > 0; j--) {
                        arr[i] = arr[j];
                        temp -= k;
                        k += k;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
