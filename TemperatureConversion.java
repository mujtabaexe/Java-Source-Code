import java.util.Scanner;
public class TemperatureConversion {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for Celcius to Farenheit, 2 for Farenheit to Celcius: ");
        // int operation= 0;
        int oper= sc.nextInt();
        if(oper==1){
            System.out.print("Enter temperature in Celcius: ")
            float input= sc.nextFloat();
            System.out.println("The temperture in Farenheit is: "+ (input*(9/5)+32));
            
        }

        if(oper==2){
            System.out.print("Enter the temperature in Farenheit: ");
            float input= sc.nextFloat();
            System.out.print("The temperature in Celcius is: "+((input-32)*5/9));

        }


    }
}
