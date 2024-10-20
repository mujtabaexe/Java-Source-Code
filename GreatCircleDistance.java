import java.util.*;
;public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = 6371.01;
        System.out.print("Enter latitude x1,y1 in degrees separated by space: ");
        double x1= sc.nextDouble();
        double y1= sc.nextDouble();
        x1=Math.toRadians(x1);
        y1=Math.toRadians(y1);
        
        System.out.print("Enter longitude x2,y2 in degrees separated by space: ");
        double x2= sc.nextDouble();
        double y2= sc.nextDouble();
        x2=Math.toRadians(x2);
        y2=Math.toRadians(y2);

        double result = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));

        System.out.println("The distance between two points is: "+result);

    }
}
