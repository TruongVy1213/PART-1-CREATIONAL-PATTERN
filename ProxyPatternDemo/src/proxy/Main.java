package proxy;

public class Main {

    public static void main(String[] args) {

        ImageGallery gallery = new ImageGallery();

        // dùng proxy
        gallery.addImage(new ImageProxy("img1.jpg"));
        gallery.addImage(new ImageProxy("img2.jpg"));

        System.out.println("App started... (chưa load ảnh)");

        System.out.println("\nNow displaying images:");
        gallery.displayImages();
    }
}