public class prefix_array {
    public static int prefix_array(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int curSum = 0;
        int prefix_arr[] = new int[numbers.length];

        prefix_arr[0] = numbers[0];
        for(int i=1; i<prefix_arr.length; i++){
            prefix_arr[i] = prefix_arr[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                curSum = 0;

                curSum = i==0 ? prefix_arr[j] : prefix_arr[j] - prefix_arr[i-1];

                if(max < curSum){
                    max = curSum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        int max = prefix_array(numbers);
        System.out.println("Maximum Sum of Subarray = "+max);
    }
}
