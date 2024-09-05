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

        
        // This is the most efficient of finding the largest number by using built-in function
        float maximum =  Math.max(num1, Math.max(num2 , num3 ));
        System.out.println("The largest number is: "+maximum);
        
        // This is the most efficient way by using logic than doing the below commented way 
        float max = num1 ;
        if(num2>max){
            max = num2;
        }
        if(num3 >max){
            max=num3;
        } 
        System.out.println("The largest number is: "+max);
        

        // if(num1>=num2 && num1>=num3){
        //     System.out.println("The first number is the largest");
        // }else if(num2>=num1 && num2>=num3){
        //     System.out.println("The second number is the largest");
        // }else{
        //     System.out.println("The third number is the largest");
        // }


        
    }
}
