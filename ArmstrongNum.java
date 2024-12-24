import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 
        // 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153, and 4679307774.
        // using recurrsion
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is armstrong: ");
        int number = sc.nextInt();
        if(isArmstrong(number)){
            System.out.println(number+" is an Armstrong number.");
        }
        else{
            System.out.println(number+" is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number){
        int power = countDigits(number);
        return number == sumOfPowers(number, power);
    }

    public static int countDigits(int number){
        if(number == 0){
            return 0;
        }
        return 1 + countDigits(number/10);
    }
    
    public static int sumOfPowers(int number , int power){
        if(number == 0 ){
            return 0;
        }
        int digit = number %10;
        return (int)Math.pow(digit,power)+ sumOfPowers(number/10,power);
    }

}
