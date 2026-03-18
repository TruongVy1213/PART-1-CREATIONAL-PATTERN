package exercise5;

public class Rabbit implements Cloneable {

    private int age;
    private Person owner;

    public Rabbit(int age, Person owner) {
        this.age = age;
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public Rabbit clone() {
        try {
            Rabbit r = (Rabbit) super.clone();
            r.owner = new Person(this.owner);
            return r;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}