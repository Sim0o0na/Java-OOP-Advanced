package car_shop_extend;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class Audi implements Rentable{
    private String model;
    private String color;
    private String countryProduced;
    private Integer minRentDays;
    private Double pricePerDay;
    private int horsePower;

    //("Leon", "Gray", 110, "Spain", 3, 99.9);
    public Audi(String model, String color, int horsepower,String country, Integer minRentDays, Double pricePerDay){
        this.model = model;
        this.color = color;
        this.horsePower = horsepower;
        this.countryProduced = country;
        this.minRentDays = minRentDays;
        this.pricePerDay = pricePerDay;
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
        return this.horsePower;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDays;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    private String getCountryProduced() {
        return this.countryProduced;
    }

    @Override
    public String toString(){
        return String.format("This is %s produced in %s and have %s tires", this.getModel(),
                this.getCountryProduced(), Car.TIRES);
    }
}
