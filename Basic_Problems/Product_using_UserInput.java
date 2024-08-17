import java.util.*;

public class Product_using_UserInput {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();

        int prod = a*b;
        System.out.println("Product of "+a+" & "+b+" = "+prod);

    }
}
