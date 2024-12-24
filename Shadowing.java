public class Shadowing {
    static int x = 100; // this is shadowed at line 5 .
    static int y = 70; 
    public static void main(String[] args) {

        System.out.println(y);
        int y;
        // System.out.println(y);  // scope will begin when value is initialised but it will not override the 
        // value of y because here a new variable is created
        y=50;
        System.out.println(y);

        System.out.println(x);
        int x = 90; // This overrides the value of x only for this scope
        System.out.println(x);
        fun();
    }
    public static void fun(){
        System.out.println(x);
    }
}
