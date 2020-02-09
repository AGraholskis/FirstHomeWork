import org.junit.jupiter.api.Test;

public class AirPlane {


    @Test
    public void pricePerFlight() {


        double price = 3.57; // 1l-price
        int consumption = 130; // litrs/100km
        int distance = 1100;
        double pricePer100km = (price * consumption);
        double pricePer1km;
        pricePer1km = (pricePer100km / 100);
        System.out.println(pricePer100km * distance);
    }
}