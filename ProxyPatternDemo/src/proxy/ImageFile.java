package proxy;

public class ImageFile implements DisplayObject {

    private String path;

    public ImageFile(String path) {
        this.path = path;
        loadFromDisk(); // nặng
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + path);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + path);
    }
}