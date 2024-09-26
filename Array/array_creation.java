package Java_Problems.Array;

public class array_creation {
    public static void main(String[] args) {
        int marks[] = new int[60];
        int numbers[] = {1, 2, 3, 4, 5};
        String fruits[] = {"apple", "mango", "banana"};

        marks[0] = 90; // physics
        marks[1] = 92; // math

        marks[0] += 3;

        System.out.println(marks[0]);
        System.out.println(numbers[0]);
        System.out.println(fruits[0]);
        System.out.println("Length of Marks = "+ marks.length);
    }
}
