public class Fibo_Recursion {
    public static void main(String[] args) {
        int n=5;
        for(int i = 0 ; i<= 5;i++){

            System.out.print(fibo(i));
            if(i<n){
                System.out.print(", ");
            }

            
        }
    }
  
    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
        
    }
}
