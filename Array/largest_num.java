package Java_Problems.Array;
import java.util.*;;

public class largest_num {
    public static int getLargest(int numbers[]) {
        int largest_num = Integer.MIN_VALUE; // -infinity
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>largest_num){
                largest_num = numbers[i];
            }
        }
        return largest_num;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 5, 4, 6, 3};
        int max = getLargest(numbers);
        System.out.println("Largest Value = "+max);
    }
}
