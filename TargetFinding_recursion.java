public class TargetFinding_Recursion {
    public static void main(String[] args) {
        int[] arr = {3,2,18,1,9};
        int target= 18;
        
       System.out.println(search(arr,target,0));
    }
    public static int search(int[] arr , int target, int n){
        if (n==arr.length) {
            return -1;            
        }
        if(arr[n]==target){
            return n;
        }
        else{

            return search(arr, target, n+1);
        }
    }
}
