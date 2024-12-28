public class CountZeros {
    public static void main(String[] args) {
        int n =30204;
        int count =0;
        int ans = helper(n,count);
        System.out.println(ans);
    }
    public static int helper(int n, int  count){
        
        if(n==0){
            return count;
        }
        int rem = n%10;
        if(rem==0){
                return helper(n/10, count+1);
        }
        return helper(n/10, count);
     
    }
}
