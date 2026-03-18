package factorypattern;

public class CandyStore {

    public Candy orderCandy(String type) {

        Candy candy = CandyFactory.createCandy(type);

        if(candy != null) {
            candy.produceCandy();
        }

        return candy;
    }

}