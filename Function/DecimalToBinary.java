package Java_Problems.Function;

public class DecimalToBinary {
    public static int dectobin(int n) {
        int pow = 0;
        int result = 0;
        while(n>0){
            int rem = n%2;
            result += rem * Math.pow(10, pow);
            pow++;
            n /= 2;
        }
        return result;
    }
    public static void main(String[] args) {
        int bin = dectobin(11);
        System.out.println("Conversion:"+bin);
    }
}
