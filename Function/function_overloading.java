package Java_Problems.Function;

public class function_overloading {
    public static int sum(int a, int b) {
        return a+b;
    }
    public static float sum(float a, float b) {
        return a+b;
    }
    public static int multiply(int a, int b) {
        return a*b;
    }
    public static int multiply(int d, int e, int f) {
        return d*e*f;
    }
        public static void main(String[] args) {
        int mult1 = multiply(2, 4);
        int mult2 = multiply(2, 3, 4);
        System.out.println("Multiplication : "+mult1);
        System.out.println("Multiplication : "+mult2);

        int sum1 = sum(3, 4);
        float sum2 = sum(3.2f, 4.3f);
        System.out.println("Sum : "+sum1);
        System.out.println("Sum : "+sum2);
    }
}