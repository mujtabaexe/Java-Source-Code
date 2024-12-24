import java.util.Scanner;
public class Bin2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        try{

            String num = sc.nextLine();
            check(num);
        }
        catch(NumberFormatException ex){
            System.out.print("Number format Exception");
        }

    }
    public static void check(String num) throws NumberFormatException{
        for (int i = 0 ; i<num.length(); i++){
            if(num.charAt(i)=='1'|| num.charAt(i)=='0'){
            }
            else{
                throw new NumberFormatException();
            }
        }
    }
}
