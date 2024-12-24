import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it is palindrome: ");
        String palindrome = sc.nextLine();
        palindrome = palindrome.toLowerCase();
        for(int i = 0 ; i<palindrome.length();i++){
            char ch1 = palindrome.charAt(i);
            char ch2 = palindrome.charAt(palindrome.length()-1-i);
            
            if (ch1 != ch2) {
                System.out.print("The given string is not a Palindrome");
                return;
            }
        }
        System.out.print("It is a Palindrome");
        sc.close();
    }
}
    
    