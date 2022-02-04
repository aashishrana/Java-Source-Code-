import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array of primitives
        // int []arr = new int[5];
        // arr[0] = 11;
        // arr[1] = 22;
        // arr[2] = 33;
        // arr[3] = 42;
        // arr[4] = 55;
        
        

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // Input Using for Loops

        String[] str = new String[4];
        for(int i=0; i<str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println();

        for(int i=0; i<str.length; i++) {
            System.out.println(str[i]);
        }

        System.out.println(Arrays.toString(str));

        int [] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}