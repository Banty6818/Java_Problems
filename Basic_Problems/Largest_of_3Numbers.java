public class Largest_of_3Numbers {
    public static void main(String args[]){
        int a=1, b=2, c=3;

        if(a>=b && a>=c){
            System.out.println(a+" is largest");
        }
        else if(b>=c){
            System.out.println(b+" is largest");
        }
        else{
            System.out.println(c+" is largest");
        }
    }
}
