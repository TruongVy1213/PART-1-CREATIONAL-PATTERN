package builderpattern;

public class BedroomBuilder {

    private String bedType;
    private int windows;
    private boolean tv;
    private boolean wifi;
    private boolean balcony;
    private boolean bathroom;
    private int size;
    private String floorMaterial;

    public BedroomBuilder setBedType(String bedType) {
        this.bedType = bedType;
        return this;
    }

    public BedroomBuilder setWindows(int windows) {
        this.windows = windows;
        return this;
    }

    public BedroomBuilder setTv(boolean tv) {
        this.tv = tv;
        return this;
    }

    public BedroomBuilder setWifi(boolean wifi) {
        this.wifi = wifi;
        return this;
    }

    public BedroomBuilder setBalcony(boolean balcony) {
        this.balcony = balcony;
        return this;
    }

    public BedroomBuilder setBathroom(boolean bathroom) {
        this.bathroom = bathroom;
        return this;
    }

    public BedroomBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public BedroomBuilder setFloorMaterial(String floorMaterial) {
        this.floorMaterial = floorMaterial;
        return this;
    }

    public Bedroom createBedroom() {
        return new Bedroom(bedType, windows, tv, wifi,
                balcony, bathroom, size, floorMaterial);
    }
}