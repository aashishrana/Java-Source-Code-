/*class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("write something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}*/

class Student {
    String name;
    int age;
    
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("This is the default constructor");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


public class OopsFun {
    public static void main(String []args) {

       /*  Pen p1 = new Pen();
         p1.color = "red";
        // p1.type = "gel";
        // p1.write();

        Pen p2 = new Pen();
        p2.color = "Black";
        p2.type = "ballpoint";
        p2.printColor();
        p1.printColor();*/

        Student s1 =new Student("Aashish Rana", 21);
        // s1.name = "Aashish rana";
        // s1.age = 20;

        s1.printInfo();




    }
}