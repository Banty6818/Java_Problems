package Java_Problems.Function;

public class prime_inrange {
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
    public static void prime_inrange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime_number(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        prime_inrange(100);
    }
}
