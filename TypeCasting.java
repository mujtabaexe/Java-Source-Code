
import java.util.Scanner;
public class TypeCasting {
    
}

public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: "); // If you put integer its type casting will occur and will be considered as Floating number
    // Left side should be greater than the right side
    float num = input.nextFloat(); // Should use a compatible data type
    System.out.println("The number you entered is: " + num); 


    // TYPE CASTING

    int i1 = (int)(num);
    int i2 = (int)(66.987);
    System.out.println("The only int part is printed of your selected number as: "+i1);
    System.out.println("The integer part of the stored number is: "+i2);

    int a = 257;
    //byte b = a; // it will give an error because a is of type integer and you are converting it to a smaller type
    byte b = (byte)(a); // 257%256=1 is happening here
    System.out.println(b); // The value should be <= 256. Greater than 256 prints 1 and less than prints 0 and less than -256 prints -1
    
    int number = 'A';
    System.out.println(number);


}