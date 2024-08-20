public class ConditionalStatements {
    public static void main(String args[]){

        // if-else conditions
        int a = 21;
        if(a>18){
            System.out.println("You can vote.");
        }
        else{
            System.out.println("You can't vote.");
        }

        // else-if statement
        if(a<13){
            System.out.println("Child");
        }
        else if(a>13 && a<21){
            System.out.println("Young");
        }
        else{
            System.out.println("Adult");
        }
    }
}
