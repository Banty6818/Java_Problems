public class Pattern1{
/* displaying following pattern:
    ****
    ***
    **
    * 
*/
    public static void main(String args[]){
        // method-1
        System.out.println("Manually:");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        // method-2
        System.out.println("Using Loop:");
        for(int i=0; i<4; i++){
            for(int j=0; j<4-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}