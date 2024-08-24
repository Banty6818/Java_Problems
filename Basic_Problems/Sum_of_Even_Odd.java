import java.util.*;

public class Sum_of_Even_Odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();

        int even_sum = 0;
        int odd_sum = 0;
        for(int i=0; i<n; i++){
            System.out.print("Enter number:");
            int number = sc.nextInt();

            if(number%2==0){
                even_sum += number;
            }
            else{
                odd_sum += number;
            }
        }

        System.out.println("Sum of Even numbers:"+even_sum);
        System.out.println("Sum of Odd numbers:"+odd_sum);
    }
}
