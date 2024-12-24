import java.util.Arrays;
import java.util.Scanner;

public class SwapNumbersInMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        int num1 = sc.nextInt(); 
        int num2 = sc.nextInt();

        swap(num1, num2);

        String name = "Ahmad";
        System.out.println(name);
        changename(name);
        System.out.println(name);
    
        int[] arr ={1,2,3,4,5};

        
        System.out.println(Arrays.toString(arr)); 
        arrchange(arr);
        System.out.println(Arrays.toString(arr)); 
    
    }
    public static void swap(int num1, int num2){
        int temp= num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        System.out.println(num2);
        
    }
    
    public static void changename(String name){
        name = "Mujtaba";
        System.out.println(name);
    }

    public static void arrchange(int[] arr ){
        arr[0] = 99;
        System.out.println(Arrays.toString(arr)); 
    }
}
