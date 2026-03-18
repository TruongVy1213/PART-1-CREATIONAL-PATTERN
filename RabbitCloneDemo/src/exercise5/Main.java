package exercise5;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Vy1");

        Rabbit r1 = new Rabbit(2, p1);

        Rabbit r2 = r1.clone();

        System.out.println("Rabbit1 age: " + r1.getAge());
        System.out.println("Rabbit2 age: " + r2.getAge());

        System.out.println("Owner1: " + r1.getOwner().getName());
        System.out.println("Owner2: " + r2.getOwner().getName());

        r2.getOwner().setName("Vy2");

        System.out.println("After change owner:");

        System.out.println("Owner1: " + r1.getOwner().getName());
        System.out.println("Owner2: " + r2.getOwner().getName());
    }
}