// Diplay the number except user input the multiple of 10
import java.util.*;

public class Continue_Problem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter number / Enter 0 for terminate the loop:");
            int n = sc.nextInt();

            if(n==0){
                break;
            }
            else if(n%10==0){
                continue;
            }
            
            System.out.println(n);
        }
        while(true);
    }
}
