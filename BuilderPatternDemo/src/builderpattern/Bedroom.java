package builderpattern;

public class Bedroom {

    private String bedType;
    private int windows;
    private boolean tv;
    private boolean wifi;
    private boolean balcony;
    private boolean bathroom;
    private int size;
    private String floorMaterial;

    public Bedroom(String bedType, int windows, boolean tv, boolean wifi,
                   boolean balcony, boolean bathroom, int size, String floorMaterial) {

        this.bedType = bedType;
        this.windows = windows;
        this.tv = tv;
        this.wifi = wifi;
        this.balcony = balcony;
        this.bathroom = bathroom;
        this.size = size;
        this.floorMaterial = floorMaterial;
    }

    public String toString() {
        return "Bedroom [bedType=" + bedType +
                ", windows=" + windows +
                ", tv=" + tv +
                ", wifi=" + wifi +
                ", balcony=" + balcony +
                ", bathroom=" + bathroom +
                ", size=" + size +
                ", floorMaterial=" + floorMaterial + "]";
    }
}