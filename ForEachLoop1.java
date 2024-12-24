public class ForEachLoop1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for(int i : arr){
            System.out.println(i);
        }

        for (int number : arr){
            System.out.println(number);
        }
    }
}
