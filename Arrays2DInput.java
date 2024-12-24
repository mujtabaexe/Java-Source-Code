
import java.util.Arrays;
import java.util.Scanner;

public class Arrays2DInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for 2D array: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number of columns for 2D array: ");
        int num2 = sc.nextInt();

        int[][] arr = new int[num1][num2];
        for(int row = 0; row<num1 ;row++) {
            for(int col = 0 ; col<num2 ; col++){
                System.out.printf("Enter element for row %d and  column %d: ", row, col);
                arr[row][col] = sc.nextInt();
            }
        }
        printArr(arr);
        enhancedForLoop(arr);
        printRowAndCol(arr);
        
        sc.close();
    }
    
    public static void printArr(int[][] arr){
        for (int row = 0 ; row<arr.length ;row++){

            System.out.println(Arrays.toString(arr[row]));
        } 
        
    }
    
    public static void enhancedForLoop(int[][] arr){
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        
    }
    public static void printRowAndCol(int[][] arr){
        for(int row = 0 ; row<arr.length; row++){
            for(int col = 0 ; col<arr.length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        
    }
}
