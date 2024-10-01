import java.util.Arrays;

public class triplet {
    public static void triplet(int numbers[]) {
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 2; i++) {
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < numbers.length - 1; j++) {
                if (j > i + 1 && numbers[j] == numbers[j - 1]) {
                    continue;
                }
                for (int k = j + 1; k < numbers.length; k++) {
                    if (k > j + 1 && numbers[k] == numbers[k - 1]) {
                        continue;
                    }
                    if (numbers[i] + numbers[j] + numbers[k] == 0) {
                        System.out.println("[" + numbers[i] + ", " + numbers[j] + ", " + numbers[k] + "]");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int numbers[] = {-1, 0, 1, 2, -1, 4};
        triplet(numbers);
    }
}