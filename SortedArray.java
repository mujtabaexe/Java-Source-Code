public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7};
        boolean check=true;        
        for (int i =0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                check = false;
                break;
            }
        }
        System.out.println(check);

        int max=Integer.MIN_VALUE;
        for (int a : arr) {
            if(max>a){
                check = false;
                break;
            }
            max=a;
            
        }
        System.out.println(check);

        System.out.println(sort(arr, 0));
    }

        public static boolean sort(int[] arr, int i){
            if(i==arr.length-1){
                    return true;
            }
            return arr[i]<=arr[i+1] && sort(arr, i+1);
        }
}
