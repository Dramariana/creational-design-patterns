package factories;

import delivery.CarDelivery;
import delivery.Delivery;
import favor.CarFavor;
import favor.Favor;
import transportation.CarTransportation;
import transportation.Transportation;

public class CarFactory implements Factory {
    @Override
    public Delivery createDelivery() {
        return new CarDelivery();
    }

    @Override
    public Favor createFavor() {
        return new CarFavor();
    }

    @Override
    public Transportation createTrasportation() {
        return new CarTransportation();
    }
}
