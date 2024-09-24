package Java_Problems.Function;

public class isPrime {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    // Optimized Solution use range from 2 to square root of n
    public static boolean isPrime_number(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        boolean isprime = isPrime(2);
        System.out.println("Number is "+isprime);
        boolean isprime1 = isPrime_number(16);
        System.out.println("Number is "+isprime1);
    }
}