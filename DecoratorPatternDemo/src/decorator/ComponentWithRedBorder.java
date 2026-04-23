package decorator;

public class ComponentWithRedBorder implements Component {

    private Component component;

    public ComponentWithRedBorder(Component component) {
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw(); // gọi cái gốc trước
        addRedBorder();
    }

    private void addRedBorder() {
        System.out.println(" -> Adding RED border");
    }
}