public class Scope {
    public static void main(String[] args) {
        int a = 90;
        String s = "Ahmad";
        
        {
            // int a= 90; cannot initialise again 
            a = 100; // but can change value
            s = "Mujtaba"; // string is immutable
            System.out.println(a);
            System.out.println(s);
        }
        System.out.println(a);
        System.out.println(s);
    }
}
