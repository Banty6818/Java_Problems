public class Type_Conversion {
    public static void main(String[] args) {
        System.out.println("Implicit Type Conversion");
        int a = 10;
        float b = a;
        System.out.println("Value before type conversion:"+a);
        System.out.println("Value after type conversion:"+b);

        System.out.println("Explicit Type Conversion");
        double pi = 3.14;
        int num = (int) pi;
        System.out.println("Value before type conversion:"+pi);
        System.out.println("Value after type conversion:"+num);

        System.out.println("Promotion in Expression");
        char A = 'a';
        char B = 'b';
        int sum = A+B;
        System.out.println("Sum of ascii of a & b is:"+sum);
    }
}
