package Java_Problems.Pattern;
import java.util.*;

public class floyds_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int x=1;

        System.out.print("Enter number:");
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}
