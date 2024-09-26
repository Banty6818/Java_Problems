package Java_Problems.Array;

public class binary_search {
    public static int binary_search(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if (numbers[mid] == key){
                return mid;
            }
            if (numbers[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 3, 4, 5, 6, 7, 8, 9};
        int key = 8;

        int index = binary_search(numbers, key);
        System.out.println("Index = "+index);
    }
}
