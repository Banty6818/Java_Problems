public class Print_Reverse_ofnumber {
    public static void main(String[] args){
        int n = 534729;
        int rev = 0;
        while(n>0){
            int last_digit = n%10;
            n = n/10;
            rev = (rev*10)+last_digit;
        }

        System.out.println("Reverse:"+rev);
    }
}
