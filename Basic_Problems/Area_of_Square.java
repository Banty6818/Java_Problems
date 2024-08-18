import java.util.*;

public class Area_of_Square {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of Square:");
        int side = sc.nextInt();
        int area = side*side;

        System.out.println("Area of Square:"+area);
    }
}
