public class Logical_Operators {
    public static void main(String args[]){
        int a = 5;
        int b = 4;

        System.out.println((a>b)&&(a<b)); // && - Logical And (output-false)
        System.out.println((a>b)||(a<b)); // || - Logical Or (output-true)
        System.out.println(!(a>b)); // ! - Logical Not (output-false)
    }
}
