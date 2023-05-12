package factories;

import delivery.Delivery;
import delivery.MotoDelivery;
import favor.Favor;
import favor.MotoFavor;
import transportation.MotoTransportation;
import transportation.Transportation;

public class MotoFactory implements Factory{
    @Override
    public Delivery createDelivery() {
        return new MotoDelivery();
    }

    @Override
    public Favor createFavor() {
        return new MotoFavor();
    }

    @Override
    public Transportation createTrasportation() {
        return new MotoTransportation();
    }
}
