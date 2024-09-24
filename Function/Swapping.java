package Java_Problems.Function;

public class Swapping {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values in Swap Method");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        swap(a, b);
        System.out.println("Values in Main Method");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
