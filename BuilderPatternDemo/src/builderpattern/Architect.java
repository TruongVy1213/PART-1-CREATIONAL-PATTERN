package builderpattern;

public class Architect {

    public Bedroom buildBedroom() {

        Bedroom bedroom = new BedroomBuilder()
                .setBedType("King")
                .setWindows(2)
                .setTv(true)
                .setWifi(true)
                .setBalcony(true)
                .setBathroom(true)
                .setSize(30)
                .setFloorMaterial("Wood")
                .createBedroom();

        return bedroom;
    }
}