import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter + to add - to subtract * to multiply / to divide or x other key to exit: ");
            char oper = sc.next().trim().charAt(0);          
            if (oper == 'x'){
                System.out.print("You have exited the Program");
                break;
            }     
            if(oper == '+' || oper == '-' || oper == '*' || oper == '/'){
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            int ans = 0;

        if(oper == '+'){
            ans = num1 + num2;
        }
         
        else if(oper == '-'){
            ans = num1 - num2;
        }
         
        else if(oper == '*'){
            ans = num1 * num2;
        }
         
        else if(oper == '/'){
            while(num2==0){
                System.out.print("Cannot be divided by zero enter the second number again: ");
                num2 = sc.nextInt();
                }
        ans = num1 / num2;
        }
        System.out.println("The answer is: "+ans);
        }
        else{
            System.out.print("Invalid Operator, enter again, ");
}
}
}
}



