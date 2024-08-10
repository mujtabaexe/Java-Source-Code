import java.util.Scanner;

public class RollNo{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Roll No: ");
        int roll = input.nextInt();
        System.out.println("Your Roll No is: " + roll);

        int a = 234_000_000; // The underscore is ignored here and can be used instead of comma","
        System.out.print(a);

    }
}
