
import java.util.Arrays;


public class Transpose {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3,},
        {4, 5, 6},
        {7, 8, 9}

        };
        int cols =arr[0].length;
        int rows = arr.length;
        int[][] trans = new int[cols][rows];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                trans[j][i]=arr[i][j];
            }
           

        }
        for(int[] a: trans){
            System.out.println(Arrays.toString(a));
        }
    }
}
