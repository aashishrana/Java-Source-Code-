import java.util.*;
public class Strings {
    public static void main(String []args) {
        System.out.println("string makes easy");

        String name ="Tony";
        String fullname = "Tony stark";

        System.out.println(fullname);

        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine();
        System.out.println(city);

        System.out.println(name + fullname);
    }
}