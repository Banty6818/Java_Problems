public class triplet{
    public static void triplet(int numbers[]) {
        int[] result = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                for(int k=j+1; k<numbers.length; k++){
                    int sum = numbers[i] + numbers[j] + numbers[k];
                    if(sum==0){
                        System.out.println("["+numbers[i]+", "+numbers[j]+", "+numbers[k]+"]");
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