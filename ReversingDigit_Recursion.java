public class ReversingDigit_Recursion {
    public static void main(String[] args) {
        int n=123;
        reverse(n);
    }
    public static int reverse(int n){
        if(n<=9){
            System.out.print(n);
            return n;
        }
        int rem = n%10;
        System.out.print(rem);
        return reverse(n/10);

    }
}
