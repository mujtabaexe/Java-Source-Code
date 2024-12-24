public class Overloading {
    public static void main(String[] args) {
        // Functions having same name but different number or type of arguments or both
        fun();
        // ambiguity(); //It will give ambiguity bcz it doesnot takes any argument and the functions created takes arguments
        fun(90);
        fun("Mujtaba");
    }
    public static void fun(){
        System.out.println("Hello, World!");
    }
    public static void ambiguity(int ...v){
        System.out.println("Hello, World!");
    }
    public static void ambiguity(String ...v){
        System.out.println("Hello, World!");
    }
    public static void fun(int a){
        System.out.println(a);

    }
    public static void fun(String a){
        System.out.println(a);
    }

}
