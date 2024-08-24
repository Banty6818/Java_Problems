import java.util.*;

public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        
        boolean flag = true;
        
        if(n <= 1){
            flag = false;
        } 
        
        else {
            for(int div = 2; div * div <= n; div++){
                if(n % div == 0){
                    flag = false;
                    break;
                }
            }
        }
        
        if(flag){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }
    }
}