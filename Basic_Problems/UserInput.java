import java.util.*;

public class UserInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number:");
        int a = sc.nextInt();
        System.out.println("a = "+a);

        System.out.print("Enter Word:");
        String s = sc.next();
        System.out.println("s = "+s);

        System.out.print("Enter String:");
        String name = sc.nextLine();
        System.out.println("Name = "+name);
    }
}
