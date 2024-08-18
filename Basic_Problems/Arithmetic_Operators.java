public class Arithmetic_Operators {
    public static void main(String[] args) {
        // Binary Operators
        System.out.println("Binary Operators:");
        int a = 20;
        int b = 10;
        int sum = a+b; // addition operator
        System.out.println("Sum:"+sum);
        int sub = a-b; // subtraction operator
        System.out.println("Sub:"+sub);
        int mul = a*b; // multiplication operator
        System.out.println("Mul:"+mul);
        int div = a/b; // division operator
        System.out.println("Div:"+div);
        int rem = a%b; // modulo operator
        System.out.println("Rem:"+rem);

        // Unary Operators
        System.out.println("Unary Operators:");
        a++; // post increment operator
        System.out.println("A:"+a);
        ++b; // pre increment operator
        System.out.println("B:"+b);
        a--; // post decrement operator
        System.out.println("A:"+a);
        --b; // pre decrement operator
        System.out.println("B:"+b);
    }
}
