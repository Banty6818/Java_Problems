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

        // ternary operator
        int num1 = 5;
        int num2 = 3;
        int larger = (num1>num2)?num1:num2;
        System.out.println(larger);

        // switch statement
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("Hii Ritesh Bodkhe");
                break;
            case 2:
                System.out.println("Do you want a tea??");
                break;
            default:
                System.out.println("Good bye!!");
                break;
        }
    }
}
