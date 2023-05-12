package factories;

import delivery.BiciDelivery;
import delivery.Delivery;
import favor.BiciFavor;
import favor.Favor;
import transportation.BiciTransportation;
import transportation.Transportation;

public class BiciFactory implements Factory{
    @Override
    public Delivery createDelivery(){
        return new BiciDelivery();
    }

    @Override
    public Favor createFavor() {
        return new BiciFavor();
    }

    @Override
    public Transportation createTrasportation() {
        return new BiciTransportation();
    }
}
