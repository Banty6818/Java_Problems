package Java_Problems.Function;

public class sum_of_digits {
    public static int sum(int n) {
        int result = 0;
        while(n>0){
            int digit = n % 10;
            result += digit;
            n /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        int sum = sum(512);
        System.out.println("Sum:"+sum);
    }
}
