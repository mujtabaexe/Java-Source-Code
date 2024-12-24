
import java.util.Scanner;

public class Max_Min_InArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {0,1,2,3,4,9,5,6,7,8};
        max_min(arr);

    }
    public static void max_min(int[] arr){
        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        int sndmax= Integer.MIN_VALUE;
        for(int a : arr){
            if(max<a){
                max=a;
            }
            if(sndmax<a){
                sndmax= a;
                if(sndmax==max){
                    sndmax=Integer.MIN_VALUE;
                }

            }
            if(min>a){
                min=a;
            }

        }
        System.out.println(max);
        System.out.println(sndmax);
        System.out.println(min);
    }

}
