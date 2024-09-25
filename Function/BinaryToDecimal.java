package Java_Problems.Function;

public class BinaryToDecimal {
    public static int bintodec(int n) {
        int pow = 0;
        int result = 0;
        int last_digit;

        while(n>0){
            last_digit = n%10;
            result += last_digit * Math.pow(2, pow);
            pow++;
            n = n/10;
        }
        return result;
    }
    public static void main(String[] args) {
        int num = bintodec(101);
        System.out.println("Conversion = "+num);
    }
}
