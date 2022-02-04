import java.util.Scanner;


public class ReverseString {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(input);

        for(int i=0; i<input.length(); i++){
            System.out.println(i);
        }

        
    }
}