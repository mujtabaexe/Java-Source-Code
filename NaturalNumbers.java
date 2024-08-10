public class NaturalNumbers {
    public static void main(String[] args){

        // Loop for first 100 Natural numbers
        for(int n=1;n<=100 ; n++){
            System.out.print(n + " ");

        }        
        System.out.println();
        // Now using while loop
        int natural=1;
        while(natural<=100){
            System.out.print(natural+ " ");
            natural+=1;
            
        }
        
        System.out.println();
        // Loop for first 100 Even numbers
        for (int even = 0; even<=100; even+=2) {
            System.out.print(even+ " ");
            
        }
        System.out.println();
        // Now Using While Loop
        int even2=0;
        while(even2<=100){
            System.out.print(even2+" ");
            even2+=2;
        }


    }
}
