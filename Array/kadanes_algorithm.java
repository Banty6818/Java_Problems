public class kadanes_algorithm {
    public static int kadanes_algo(int numbers[]) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            curr_sum = curr_sum + numbers[i];
            if(curr_sum < 0){
                curr_sum = 0;
            }
            if(curr_sum>max_sum){
                max_sum = curr_sum;
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int numbers[] = {5, 9, -2, 3, 7, -6, -5};
        int max = kadanes_algo(numbers);
        System.out.println("Max Sum = "+max);
    }
}
