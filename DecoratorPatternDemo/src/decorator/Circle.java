package decorator;

public class Circle implements Component {

    private String name;

    public Circle(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle: " + name);
    }
}