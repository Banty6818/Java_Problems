import java.util.*;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.print("Enter operator:");
        char operator = sc.next().charAt(0);

        Switch(operator){
            case '+':
                System.out.println(a+"+"+b+":"+(a+b));
                break;
            case '-':
                System.out.println(a+"-"+b+":"+(a-b));
                break;
            case '%':
                System.out.println(a+"%"+b+":"+(a%b));
                break;
            case '*':
                System.out.println(a+"*"+b+":"+(a*b));
                break;
            case '/':
                System.out.println(a+"/"+b+":"+(a/b));
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
