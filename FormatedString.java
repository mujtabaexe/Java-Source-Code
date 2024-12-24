import java.util.Scanner;

public class FormatedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // The %d or %s indicates the width of the output
        System.out.printf("My age is %5d, I will be %d in 2 weeks, and my name is %s.", 22, 23, "Ahmad");
    }
}