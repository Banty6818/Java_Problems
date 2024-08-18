import java.util.*;

public class Billing_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount of Pen:");
        float pen = sc.nextFloat();
        System.out.print("Enter Amount of Pencil:");
        float pencil = sc.nextFloat();
        System.out.print("Enter Amount of Eraser:");
        float eraser = sc.nextFloat();

        float total = pen+pencil+eraser;
        System.out.println("Total:"+total);
        float gst = total*0.18f;
        System.out.println("GST:"+gst);
        float bill = total+gst;
        System.out.println("Total Bill with 18% GST:"+bill);
    }
}
