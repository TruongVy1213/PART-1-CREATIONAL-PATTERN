package bridge;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle(new Red());
        Shape s2 = new Triangle(new Blue());

        s1.draw();
        s2.draw();
    }
}