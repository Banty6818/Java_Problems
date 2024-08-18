import java.util.*;

public class Area_Of_Rectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width:");
        int w = sc.nextInt();
        System.out.print("Enter height:");
        int h = sc.nextInt();
        int area = w*h;
        System.out.println("Area:"+area);
    }
}
