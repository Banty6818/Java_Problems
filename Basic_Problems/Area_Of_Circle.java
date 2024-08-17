import java.util.*;

public class Area_Of_Circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius:");
        float radius = sc.nextInt();
        float pi = 3.14;

        float area = pi*radius*radius;
        System.out.println("Area of Circle:"+area);
    }
}
