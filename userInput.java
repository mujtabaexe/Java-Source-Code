import java.util.Scanner;

public class userInput {
    
    
    public static void main (String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.print("Input the first number: ");
    int num1= sc.nextInt();

    System.out.print("Input the Second number: ");
    int num2=sc.nextInt();

    System.out.print("Enter the third number in decimals: ");
    float f1 = sc.nextFloat();
    
    System.out.print("Enter the fourth number in decimals: ");
    float f2 = sc.nextFloat();

    int sum = num1 + num2 ;

    float fsum= f1 + f2;
    System.out.print("The sum of the two decimal numbers is: ");
    System.out.println(fsum);


    System.out.print("The sum of the two numbers is: ");
    System.out.print(sum);


        
    }
}

