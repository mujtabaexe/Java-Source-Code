import java.util.Scanner;

private class Object{}
public class studentMarks {
    
}

public static void main(String[] argss){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your marks in Physics: ");
    int num1= sc.nextInt();
    System.out.print("Enter your marks in Biology: ");
    int num2= sc.nextInt();
    System.out.print("Enter your marks in English: ");
    int num3= sc.nextInt();
    System.out.print("Enter your marks in Maths: ");
    int num4= sc.nextInt();
    System.out.print("Enter your marks in Chemistry: ");
    int num5= sc.nextInt();

    int per= (num1 + num2 + num3 + num4 + num5)*100/500;

    System.out.println("Your percentage is: ");
    System.out.print(per);


}