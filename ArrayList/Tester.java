import java.util.*;
public class Tester {
    public static void main(String []args) {
        List <String> list = new ArrayList <String>();

        list.add("Pizza");
        list.add(0, "Burger");
        list.add(0, "Sandwich");
        list.add(0, "Noodles");

        System.out.print(list.size()); 
    }
}