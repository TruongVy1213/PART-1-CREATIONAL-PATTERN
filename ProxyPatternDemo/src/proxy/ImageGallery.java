package proxy;

import java.util.ArrayList;
import java.util.List;

public class ImageGallery {

    private List<DisplayObject> images = new ArrayList<>();

    public void addImage(DisplayObject image) {
        images.add(image);
    }

    public void displayImages() {
        for (DisplayObject img : images) {
            img.display();
        }
    }
}