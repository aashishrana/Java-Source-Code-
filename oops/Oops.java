public class Oops {
    public static void main (String []args) {
        Person p1 = new Person();
        p1.name = "Aashish";
        p1.age = 20;

        Person p2 = new Person();

        p2.age = 24;
        p2.name = "Anuj";

        // System.out.println(p1.age + " " + p1.name + " " + p2.name + " " + p2.age);
        p1.eat();
        p2.walk(100);

        System.out.println(Person.count);
      // System.out.println(p1.walk());


    }
}

class Person {
    String name;
    int age;

    static int count;

    public Person() {
        count++;
        System.out.println("creating defauit constructor");
    }

    void walk() {
        System.out.println(name + " is walking");
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void walk(int steps) {
        System.out.println(name + "walked " + steps);
    }
}