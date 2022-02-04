import java.util.ArrayList;
import java.util.Collections;

class ArrayList1 {
    public static void main(String []args){
        
        ArrayList<Integer> list = new ArrayList<Integer>();
       // ArrayList<String> list2 = new ArrayList<String>();
        //ArrayList<boolean> list3 = new ArrayList<boolean>();

        list.add(0);
        list.add(2);
        list.add(4);

        System.out.println(list);

        // get elements 

        System.out.println(list.get(0));

        int element = list.get(1);

        System.out.println(element);

        // Add element in between

        list.add(1, 5);
        System.out.println(list);

        //int print = list.add(1 , 5);
        //System.out.println(print);  Error print hoti hai


        // Set element 
        list.set(0, 20);
        System.out.println(list);

        // delete element 
        list.remove(3);
        System.out.println(list);

        // Size of the ArrayList

        int size = list.size();

        System.out.println(list.size());
        System.out.println(size);

        // loops 

        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        // sorting 
        Collections.sort(list);
        System.out.println(list);
    }
}