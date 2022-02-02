import java.util.*;
public class Greatest {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("number one is greatest number");
        }
        

        else if(num2 > num1 && num2 >num3) {
            System.out.println("num 2 is greatest number");
        }
        else {
            System.out.println("num 3 is greatest ");
        }

        
    }
}