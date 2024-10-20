// https://youtu.be/mA23x39DjbI?si=j4uOcK1Nj4vImMhR     FOR SWITCH CASE STATEMENTS BY KUNAL KUSHWAHA
import java.util.*;
public class SwitchStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a fruit name: ");
        String fruit = sc.next();


        //IMP: switch cases are used in simple problems , for more comlex we use if-else.

        // Old way to use switch cases
        
        
        switch(fruit){
            case "Mango":
            System.out.println("King of fruits");
            break;  // If break statement is not entered then all the below case will also be checked
            case "Orange":
            System.out.println("A round fruit");
            break;
            case "Grapes":
            System.out.println("Grapes");
            break;
            default:  // If no case is matched default is always checked . It is always placed in the last
            System.out.println("Enter a valid fruit");
            
            
        } 
        // Old way to use switch cases
        
        switch(fruit){
            case "Mango" -> System.out.println(" The fruit is Mango");
            case "Orange" -> System.out.println(" The fruit is Orange");
            case "Grapes" -> System.out.println(" The fruit is Grapes");
            default -> System.out.println("Enter a valid fruit");

        }
        
        
    }
}

