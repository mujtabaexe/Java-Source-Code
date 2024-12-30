public class PrimeNum_Recrsion {
    public static void main(String[] args) {
        int n= 2;
        int i=2;
        System.out.println(primeUsingRecurrsion(n,i));
    }
    public static void primeUsingWhile(){
        
    }
    public static void primeUsingFor(){
        
    }
    public static boolean primeUsingRecurrsion(int n , int i ){
        if(n==2){
            return true;
        }
        if(n<2){
            return false;
        }
        if(n%i==0){
            return false;
        }
        return primeUsingRecurrsion(n,i+1);
    }
}
