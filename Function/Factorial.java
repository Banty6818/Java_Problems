package Java_Problems.Function;

public class Factorial {
    public static int factorial(int n){
        int f = 1;
        for(int i=n; i>0; i--){
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        int n = 9;
        int fact = factorial(n);
        System.out.println("Factorial of "+n+" = "+fact);
    }
}
