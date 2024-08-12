import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number for which you want to find the Fibonacci Sequencer: ");
        int num = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int count = 2;
        while (count <=num){
        int temp = num2;
        num2 = num2 + num1;
        num1 = temp;
        count++;

        }
        System.out.println("The "+num+"th Fibonacci number is: "+ num2);
    }

}