package Java_Problems.Pattern;
import java.util.*;

public class hollow_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, w;

        System.out.print("Enter Height:");
        h = sc.nextInt();

        System.out.print("Enter Width:");
        w = sc.nextInt();

        for(int i=1; i<=h; i++){
            if(i==1 || i==h){
                for(int j=1; j<=w; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=1; j<=w; j++){
                    if(j==1 || j==w){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}