import java.util.*;
public class InputRectangle {
    public static void main(String []args) {

        Scanner sc  = new Scanner(System.in);
        int rows = sc.nextInt();
        int col=  sc.nextInt();

        for(int i=1; i<=rows;i++) {
            for(int j=1; j<=col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
// hollow rectangle pattern

        for(int i=1; i<=rows;i++) {
            for(int j=1; j<=col; j++) {
                if(i == 1 || i == rows || j == 1 || j == col) {
                    
                    System.out.print("*");
            

                }
                else {
                    System.out.print(" ");
                }

               
            } 
            System.out.println();   


                
           
        }
    }
}