public class Loops {
    public static void main(String[] args) {
        // while loop
        int x = 1;
        while(x>=10){
            System.out.print(x+" ");
            x++;
        }
        System.out.println();

        // for loop
        for(int i=1; i<=10; i++){
            System.out.println(x+" ");
        }
        System.out.println();

        // do while
        int y=0;
        do{
            System.out.println("Hello Ritesh");
            y++;
        }
        while(y<10);

        // break Statement
        int n=0;
        for(int i=0; i<3; i++){
            if(n==1){
                break;
            }
            n++;
        }
        System.out.println(n);

        // continue statement
        for(int i=0; i<5; i++){
            if(i==2){
                continue;
            }
            System.out.println(i);
        }
    }
}