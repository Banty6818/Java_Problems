import java.util.*;

public class Sum_of_n_Natural_numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 1;
        int sum = 0;

        while(x<=n){
            sum += x;
            x++;
        }
        System.out.println("Sum:"+sum);
    }
}