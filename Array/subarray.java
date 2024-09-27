package Java_Problems.Array;

public class subarray {
    public static void subarray(int numbers[]) {
        for(int i=0; i<numbers.length; i++){
            int min_sum = Integer.MAX_VALUE;
            int max_sum = Integer.MIN_VALUE;
            for(int j=i; j<numbers.length; j++){
                int sum = 0;
                System.out.print("( ");
                for(int k=i; k<=j; k++){
                    sum += numbers[k];
                    if(sum<min_sum){
                        min_sum = sum;
                    }

                    if(sum>max_sum){
                        max_sum = sum;
                    }
                    
                    System.out.print(numbers[k]+" ");
                }
                System.out.print(") ");
                System.out.println("Sum = "+sum);
            }
            System.out.println("Maximum Sum = "+max_sum);
            System.out.println("Minimum Sum = "+min_sum);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        subarray(numbers);
    }
}
