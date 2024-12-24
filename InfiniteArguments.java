
import java.util.Arrays;
import java.util.Scanner;

public class InfiniteArguments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers to print or 0 to exit: ");
        for(int i= 0 ; i<1 ; i--){

            int a = sc.nextInt();
            nums(a);
            if(a==0){
                break;
            }
        }
    }
    public static void nums(int ...numbers){
        System.out.println(Arrays.toString(numbers));
    }
}
