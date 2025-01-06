
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,8,3,4,1};
        for(int i =0 ; i <arr.length-1 ; i++){
            for (int j=0; j <arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
            // System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));


        // for(int i=0;i>arr.length-1;i++){
        //     for(int j = 1; j<arr.length ; j++){
        //         if(arr[i]<arr[j]){
        //             int temp = arr[j];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        //     System.out.println(Arrays.toString(arr));
        }
    }
// }
