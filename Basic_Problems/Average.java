import java.util.*;

public class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.print("Enter c:");
        int c = sc.nextInt();

        double avg = (a+b+c)/3;
        System.out.println("Average:"+avg);
    }
}
