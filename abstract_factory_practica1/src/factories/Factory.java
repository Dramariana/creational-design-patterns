package factories;

import delivery.Delivery;
import favor.Favor;
import transportation.Transportation;

public interface Factory {

    Delivery createDelivery();
    Favor createFavor();

    Transportation createTrasportation();
}
