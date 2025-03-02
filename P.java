public class P {
    public static void main (String [] args) {
        int [] a = {1 , 2 , 3 , 2 , 1 , 6 , 3 , 4 , 5 , 2};
        int [] b = new int[a.length];
         
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <b.length; j++) {
                if (b[j]==a[i] ) {                    
                    
                }
                else if (b[j]!=a[i]) {
                    b[i] = a[i];
                    break;
                }
            }
        }
        for (int elements : b) {
            if (elements != 0) {
                System.out.print(elements+" ");
            }
        }
    }
}