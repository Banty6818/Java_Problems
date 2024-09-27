public class MaxSum_Subarray {
    public static int max_sum_subarray(int numbers[]) {
        int maxSum = 0; 
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                int curSum = 0;
                for(int k=i; k<=j; k++){
                    curSum += numbers[k];
                }
                if(maxSum < curSum){
                    maxSum = curSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        int maxSum = max_sum_subarray(numbers);
        System.out.println("Maximum Sum = "+maxSum);
    }
}
