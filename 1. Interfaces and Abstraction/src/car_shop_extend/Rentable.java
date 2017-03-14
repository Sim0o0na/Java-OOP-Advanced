package car_shop_extend;

/**
 * Created by Sim0o on 3/14/2017.
 */
public interface Rentable extends Car {
    Integer getMinRentDay();
    Double getPricePerDay();
}
