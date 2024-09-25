package Java_Problems.Function;

public class is_palindrome {
    public static boolean is_palindrome(int n) {
        int alt = n;
        int rev = 0;
        boolean result;
        while(alt>0){
            int rem = alt%10;
            rev = rev * 10 + rem;
            alt /= 10;
        }
        if(n == rev){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }
    public static void main(String[] args) {
        boolean palindrome = is_palindrome(121);
        System.out.println("Palindrome number:"+palindrome);
    }
}
