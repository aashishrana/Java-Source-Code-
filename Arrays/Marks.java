public class Marks {
    public static void main(String []args) {
        int [] marks = new int[3];

        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 100;

        System.out.println(marks);
        System.out.println(marks[0]);

        for(int i=0; i<3; i++) {
            System.out.println(marks[i]);
        }
    }
}