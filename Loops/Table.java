import java.util.*;

public class Table {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int a = sc.nextInt();

        for(int i=1; i<=n;i++) {
            System.out.println(a*i);
        }
    }
}