public class ForLoop {
    public static void main(String []args) {

        int n=10;

        for(int i= 0; i<n; i++) {
            System.out.println(i);
        }

        int j =0;

        while(j<n) {

            System.out.println("using while loop");

            System.out.println(j);

            j++;

        }

        do {
            System.out.println("using do while loop");

            System.out.println(j);
            j++;
        }while(j<n);
    }
}