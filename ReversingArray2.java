
import java.util.Arrays;
import java.util.Scanner;

public class ReversingArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len= sc.nextInt();
        int[] arr = new int[len];
        
        
        for(int i = 0 ; i<len;i++){
            System.out.printf("Enter the %d element of the array: ",i);
            arr[i]=sc.nextInt();

        }

        swap(arr, len);
    }

    public static void swap(int[] arr, int len){
        int min = 0;
        int max = len-1;

        for(int i=0; i<len ; i++){
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max]= temp;
            min++;
            max--;
            if(min==max || max<min){
                break;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
