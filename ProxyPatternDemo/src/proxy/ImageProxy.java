package proxy;

public class ImageProxy implements DisplayObject {

    private String path;
    private ImageFile realImage; // chưa tạo ngay

    public ImageProxy(String path) {
        this.path = path;
    }

    @Override
    public void display() {

        if (realImage == null) {
            realImage = new ImageFile(path); // chỉ load khi cần
        }

        realImage.display();
    }
}