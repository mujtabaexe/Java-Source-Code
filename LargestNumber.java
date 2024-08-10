import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float num1 = in.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = in.nextFloat();
        System.out.print("Enter the third number: ");
        float num3 = in.nextFloat();

        if(num1>=num2 && num1>=num3){
            System.out.println("The first number is the largest");
        }else if(num2>=num1 && num2>=num3){
            System.out.println("The second number is the largest");
        }else{
            System.out.println("The third number is the largest");
        }
        
    }
}
