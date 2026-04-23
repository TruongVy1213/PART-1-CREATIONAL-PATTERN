package decorator;

public class Main {
    public static void main(String[] args) {

        Canvas canvas = new Canvas();

        Component circle1 = new Circle("Circle 1");
        Component circle2 = new Circle("Circle 2");

        // decorate circle2
        Component redCircle = new ComponentWithRedBorder(circle2);

        System.out.println("Normal circle:");
        canvas.draw(circle1);

        System.out.println("\nCircle with red border:");
        canvas.draw(redCircle);
    }
}