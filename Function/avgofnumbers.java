package Java_Problems.Function;

public class avgofnumbers {
    public static double avg(int a, int b, int c) {
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        double average = avg(5, 4, 6);
        System.out.println("Average:"+average);
    }
}
