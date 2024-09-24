package Java_Problems.Function;

public class Binomial_Coefficient {
    public static int factorial(int n){
        int f = 1;
        for(int i=n; i>0; i--){
            f *= i;
        }
        return f;
    }

    public static int binomial_coefficient(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nr_fact = factorial((n-r));

        int bcoefficient = (n_fact)/(r_fact*(nr_fact));
        return bcoefficient;
    }
    public static void main(String[] args) {
        int bc = binomial_coefficient(5, 2);
        System.out.println("Binomial Coefficient:"+bc);
    }
}
