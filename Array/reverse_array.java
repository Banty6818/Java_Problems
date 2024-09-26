package Java_Problems.Array;

public class reverse_array {
    public static void reverse_array(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1;

        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {3, 2, 1, 6, 3, 7, 2};
        reverse_array(numbers);
        
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
