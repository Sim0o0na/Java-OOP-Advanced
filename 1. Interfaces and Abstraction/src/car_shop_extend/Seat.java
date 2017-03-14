package car_shop_extend;

import car_shop_extend.Sellable;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class Seat implements Sellable {
    private String countryProduced;
    private String color;
    private int horsepower;
    private String model;
    private Double price;

    public Seat(String model, String color, int horsepower, String countryProduced, Double price){
        this.model=model;
        this.color = color;
        this.horsepower=horsepower;
        this.countryProduced = countryProduced;
        this.price = price;
    }

    private String getCountryProduced() {
        return this.countryProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.horsepower;
    }

    @Override
    public String toString(){
        return String.format("This is %s produced in %s and have %s tires", this.getModel(),
                this.getCountryProduced(), Car.TIRES);
    }

    @Override
    public Double gerPrice() {
        return this.price;
    }
}
