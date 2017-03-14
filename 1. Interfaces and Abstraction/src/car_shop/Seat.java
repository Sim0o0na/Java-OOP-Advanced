package car_shop;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class Seat implements Car {
    private String countryProduced;
    private String color;
    private Integer horsepower;
    private String model;

    public Seat(String model, String color, Integer horsepower, String countryProduced){
        this.model=model;
        this.color = color;
        this.horsepower=horsepower;
        this.countryProduced = countryProduced;
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
    public Integer getHorsePower() {
        return this.horsepower;
    }

    @Override
    public String toString(){
        return String.format("This is %s produced in %s and have %s tires", this.getModel(),
                this.getCountryProduced(), Car.TIRES);
    }
}
