import java.util.*;
public class Airpot {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] weights = new int[n];
        for(int i=0; i<n; i++) {
            weights[i] = sc.nextInt();
        }
        int thresold = sc.nextInt();

        int amount = 0;

        for(int i=0; i<n; i++) {

            int cur_weight = weights[i];

            if(cur_weight <= thresold) {
                amount += 1;
            }
            else {
                amount += 2;
            }
        }

        System.out.println(amount);

    

    }
}